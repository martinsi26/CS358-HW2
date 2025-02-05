package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;
import wrangLR.runtime.MessageObject;
import wrangLR.runtime.FilePosObject;

public class MJGrammar implements MessageObject, FilePosObject
{

    // constructor
    // @param em error-message object
    public MJGrammar(ErrorMsg em)
    {
        errorMsg = em;
        topObject = null;
    }

    // error message object
    private ErrorMsg errorMsg;

    // object to be returned by the parser
    private Program topObject;

    // These 2 methods are needed by WrangLR
    // DO NOT USE THEM! They will not pass tests
    // We don't need any errors or warnings in this assignment.
    public void warning(int pos, String msg)
    {
        errorMsg.info(pos, msg);
    }

    public void error(int pos, String msg)
    {
        errorMsg.error(pos, msg);
    }

    // method for converting file position to line/char position
    // @param pos the file position
    // @return the string that denotes the file position
    public String filePosString(int pos)
    {
        return errorMsg.lineAndChar(pos);
    }

    // method that registers a newline
    // @param pos the file position of the newline character
    public void registerNewline(int pos)
    {
        errorMsg.newline(pos-1);
    }

    // returns the object produced by the parse
    // @return the top-level object produced by the parser
    public Program parseResult()
    {
        return topObject;
    }

    //===============================================================
    // start symbol
    //===============================================================

    //: <start> ::= ws* <program> =>
    public void topLevel(Program obj)
    {
        topObject = obj;
    }

    //================================================================
    // top-level constructs
    //================================================================

    //: <program> ::= # <class decl>+ =>
    public Program createProgram(int pos, List<ClassDecl> vec)
    {
        return new Program(pos, new ClassDeclList(vec));
    }

    //: <class decl> ::= `class # ID `{ <decl in class>* `} =>
    public ClassDecl createClassDecl(int pos, String name, List<Decl> vec)
    {
        return new ClassDecl(pos, name, "Object", new DeclList(vec));
    }

    //: <decl in class> ::= <method decl> => pass

    //: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
    public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts)
    {
        return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
                                  new StatementList(stmts));
    }
    //: <method decl> ::= `public # <type> ID `( `) `{ <stmt>* `return <exp> `} =>
    public Decl createMethodDeclVoid(int pos, Type t, String name, List<Statement> stmts, Exp e)
    {
        return new MethodDeclNonVoid(pos, t, name, new VarDeclList(new VarDeclList()),
                                  new StatementList(stmts), e);
    }

    //: <type> ::= # `int =>
    public Type intType(int pos)
    {
        return new IntegerType(pos);
    }
    //: <type> ::= # `boolean =>
    public Type booleanType(int pos)
    {
        return new BooleanType(pos);
    }
    //: <type> ::= # ID =>
    public Type identifierType(int pos, String name)
    {
        return new IdentifierType(pos, name);
    }
    //: <type> ::= # <type> <empty bracket pair> =>
    public Type newArrayType(int pos, Type t, Object dummy)
    {
        return new ArrayType(pos, t);
    }

    //: <empty bracket pair> ::= `[ `] => null

    //================================================================
    // statement-level constructs
    //================================================================

    //: <stmt> ::= <assign> `; => pass

    //: <stmt> ::= # `{ <stmt>* `} =>
    public Statement newBlock(int pos, List<Statement> sl)
    {
        return new Block(pos, new StatementList(sl));
    }
    //: <stmt> ::= <local var decl> `; => pass

    //: <assign> ::= <exp> # `= <exp> =>
    public Statement assign(Exp lhs, int pos, Exp rhs)
    {
        return new Assign(pos, lhs, rhs);
    }

    //: <local var decl> ::= <type> # ID `= <exp> =>
    public Statement localVarDecl(Type t, int pos, String name, Exp init)
    {
        return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
    }

    //================================================================
    // expressions
    //================================================================

    //: <exp> ::= <exp8> => pass

    // these precedence levels have not been filled in at all, so there
    // are only pass-through productions
    //: <exp8> ::= <exp7> => pass
    //: <exp7> ::= <exp6> => pass
    //: <exp6> ::= <exp5> => pass
    //: <exp5> ::= <exp4> => pass

    // these remaining precedence levels have been filled in to some extent,
    // but most or all of them have need to be expanded

    //: <exp4> ::= <exp4> # `+ <exp3> =>
    public Exp newPlus(Exp e1, int pos, Exp e2)
    {
        return new Plus(pos, e1, e2);
    }

    //: <exp4> ::= <exp4> # `- <exp3> =>
    public Exp newMinus(Exp e1, int pos, Exp e2)
    {
        return new Minus(pos, e1, e2);
    }

    //: <exp4> ::= <exp3> => pass

    //: <exp3> ::= <exp3> # `* <exp2> =>
    public Exp newTimes(Exp e1, int pos, Exp e2)
    {
        return new Times(pos, e1, e2);
    }
    //: <exp3> ::= <exp2> => pass

    //: <exp2> ::= <cast exp> => pass
    //: <exp2> ::= <unary exp> => pass

    //: <cast exp> ::= # `( <type> `) <cast exp> =>
    public Exp newCast(int pos, Type t, Exp e)
    {
        return new Cast(pos, t, e);
    }
    //: <cast exp> ::= # `( <type> `) <exp1> => Exp newCast(int, Type, Exp)

    //: <unary exp> ::= # `- <unary exp> =>
    public Exp newUnaryMinus(int pos, Exp e)
    {
        return new Minus(pos, new IntegerLiteral(pos, 0), e);
    }
    //: <unary exp> ::= <exp1> => pass

    //: <exp1> ::= # ID  =>
    public Exp newIdentfierExp(int pos, String name)
    {
        return new IdentifierExp(pos, name);
    }
    //: <exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `] =>
    public Exp newArrayLookup(Exp e1, int pos, Exp e2)
    {
        return new ArrayLookup(pos, e1, e2);
    }
    //: <exp1> ::= # INTLIT =>
    public Exp newIntegerLiteral(int pos, int n)
    {
        return new IntegerLiteral(pos, n);
    }
    //: <exp1> ::= # CHARLIT =>
    public Exp newCharacterLiteral(int pos, int c) 
    {
        return new IntegerLiteral(pos, c);
    }
    //: <exp1> ::= # STRINGLIT =>
    public Exp newStringLiteral(int pos, String s)
    {
        return new StringLiteral(pos, s);
    }
    //: <exp1> ::= # `true =>
    public Exp newTrue(int pos)
    {
        return new True(pos);
    }
    //: <exp1> ::= # `false =>
    public Exp newFalse(int pos)
    {
        return new False(pos);
    }
    //: <exp1> ::= # `this =>
    public Exp newThis(int pos)
    {
        return new This(pos);
    }
    //: <exp1> ::= # `null =>
    public Exp newNull(int pos)
    {
        return new Null(pos);
    }
    // //: <exp1> ::= # <type> `( `) =>
    // public Exp newObject(int pos, Type t)
    // {
    //     return new newObject(pos, t);
    // }
    // : <exp1> ::= callExp
    // : callExp ::= ID `( expList? `)
    // : 

    //================================================================
    // Lexical grammar for filtered language begins here: DO NOT
    // MODIFY ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR
    // ENTIRE LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR
    // (defined near the top of this file) to false.
    //================================================================

    //: letter ::= {"a".."z" "A".."Z"} => pass
    //: letter128 ::= {225..250 193..218} =>
    public char sub128(char orig)
    {
        return (char)(orig-128);
    }
    //: digit ::= {"0".."9"} => pass
    //: digit128 ::= {176..185} => char sub128(char)
    //: any ::= {0..127} => pass
    //: any128 ::= {128..255} => char sub128(char)
    //: ws ::= " "
    //: ws ::= {10} registerNewline
    //: registerNewline ::= # => void registerNewline(int)
    //: `boolean ::= "#bo" ws*
    //: `class ::= "#cl" ws*
    //: `extends ::= "#ex" ws*
    //: `void ::= "#vo" ws*
    //: `int ::= "#it" ws*
    //: `while ::= "#wh" ws*
    //: `if ::= '#+' ws*
    //: `else ::= "#el" ws*
    //: `for ::= "#fo" ws*
    //: `break ::= "#br" ws*
    //: `this ::= "#th" ws*
    //: `false ::= '#fa' ws*
    //: `true ::= "#tr" ws*
    //: `super ::= "#su" ws*
    //: `null ::= "#nu" ws*
    //: `return ::= "#re" ws*
    //: `instanceof ::= "#in" ws*
    //: `new ::= "#ne" ws*
    //: `case ::= "#ce" ws*
    //: `default ::= "#de" ws*
    //: `do ::= "#-" ws*
    //: `public ::= "#pu" ws*
    //: `switch ::= "#sw" ws*

    //: `! ::=  "!" ws* => void
    //: `!= ::=  "@!" ws* => void
    //: `% ::= "%" ws* => void
    //: `&& ::= "@&" ws* => void
    //: `* ::= "*" ws* => void
    //: `( ::= "(" ws* => void
    //: `) ::= ")" ws* => void
    //: `{ ::= "{" ws* => void
    //: `} ::= "}" ws* => void
    //: `- ::= "-" ws* => void
    //: `+ ::= "+" ws* => void
    //: `= ::= "=" ws* => void
    //: `== ::= "@=" ws* => void
    //: `[ ::= "[" ws* => void
    //: `] ::= "]" ws* => void
    //: `|| ::= "@|" ws* => void
    //: `< ::= "<" ws* => void
    //: `<= ::= "@<" ws* => void
    //: `, ::= "," ws* => void
    //: `> ::= ">"  !'=' ws* => void
    //: `>= ::= "@>" ws* => void
    //: `: ::= ":" ws* => void
    //: `. ::= "." ws* => void
    //: `; ::= ";" ws* => void
    //: `++ ::= "@+" ws* => void
    //: `-- ::= "@-" ws* => void
    //: `/ ::= "/" ws* => void


    //: ID ::= letter128 ws* => text
    //: ID ::= letter idChar* idChar128 ws* => text

    //: INTLIT ::= {"1".."9"} digit* digit128 ws* =>
    public int convertToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last);
    }
    //: INTLIT ::= digit128 ws* =>
    public int convertToInt(char c)
    {
        return Integer.parseInt(""+c);
    }
    //: INTLIT ::= "0" hexDigit* hexDigit128 ws* =>
    public int convert16ToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last, 16);
    }
    //: STRINGLIT ::= '@"' ws* =>
    public String emptyString(char x, char xx)
    {
        return "";
    }
    //: STRINGLIT ::= '"' any* any128 ws* =>
    public String string(char x, List<Character> mid, char last)
    {
        return ""+mid+last;
    }
    //: CHARLIT ::= "'" any ws* =>
    public int charVal(char x, char val)
    {
        return val;
    }

    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass
    //: idChar128 ::= letter128 => pass
    //: idChar128 ::= digit128 => pass
    //: idChar128 ::= {223} =>
    public char underscore(char x)
    {
        return '_';
    }
    //: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} => pass
    //: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}
