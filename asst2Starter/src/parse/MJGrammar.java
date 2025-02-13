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
    //: <decl in class> ::= <inst var decl> => pass

    // //: <formal list> ::= <type> # ID <list>* =>
    // public VarDeclList newVarDeclList(Type t, int pos, String name, List<VarDecl> list)
    // {
    //     list.add(0, new VarDecl(pos, t, name));
    //     return new VarDeclList(list);
    // }
    // //: <list> ::= `, <type> # ID =>
    // public Decl newVarDecl(Type t, int pos, String name) 
    // {
    //     return new VarDecl(pos, t, name);
    // }

    //: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
    public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts)
    {
        return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()), 
                                new StatementList(stmts));
    }
    //: <method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `} =>
    public Decl createMethodDeclVoid(Type t, int pos, String name, List<Statement> stmts, Exp e)
    {
        return new MethodDeclNonVoid(pos, t, name, new VarDeclList(new VarDeclList()), 
                                    new StatementList(stmts), e);
    }

    //: <inst var decl> ::= <type> # ID `; =>
    public Decl createInstVarDecl(Type t, int pos, String name)
    {
        return new InstVarDecl(pos, t, name);
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

    // TO DO - Call exp in statement
    // : <stmt> ::= <callExp> `; => pass

    //: <stmt> ::= # `break `; =>
    public Statement newBreak(int pos)
    {
        return new Break(pos);
    }

    //: <stmt> ::= `; => null

    //: <stmt> ::= # `{ <stmt>* `} =>
    public Statement newBlock(int pos, List<Statement> sl)
    {
        return new Block(pos, new StatementList(sl));
    }
    //: <stmt> ::= <local var decl> `; => pass

    //: <assign> ::= <exp1> # `= <exp> =>
    public Statement assign(Exp lhs, int pos, Exp rhs)
    {
        return new Assign(pos, lhs, rhs);
    }
    //: <assign> ::= ID # `++ =>
    public Statement newPostIncrement(String name, int pos) {
        IdentifierExp id = new IdentifierExp(pos, name);
        return new Assign(pos, id, new Plus(pos, id, new IntegerLiteral(pos, 1)));
    }
    //: <assign> ::= ID # `-- =>
    public Statement newPostDecrement(String name, int pos) {
        IdentifierExp id = new IdentifierExp(pos, name);
        return new Assign(pos, id, new Minus(pos, id, new IntegerLiteral(pos, 1)));
    }
    //: <assign> ::= # `++ ID  =>
    public Statement newPreIncrement(int pos, String name) {
        IdentifierExp id = new IdentifierExp(pos, name);
        return new Assign(pos, id, new Plus(pos, id, new IntegerLiteral(pos, 1)));
    }//: <assign> ::= # `-- ID =>
    public Statement newPreDecrement(int pos, String name) {
        IdentifierExp id = new IdentifierExp(pos, name);
        return new Assign(pos, id, new Minus(pos, id, new IntegerLiteral(pos, 1)));
    }

    //: <local var decl> ::= <type> # ID `= <exp> =>
    public Statement localVarDecl(Type t, int pos, String name, Exp init)
    {
        return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
    }

    //: <stmt> ::= `while # `( <exp> `) <stmt> =>
    public Statement newWhile(int pos, Exp e, Statement s) 
    {
        return new While(pos, e, s);
    }

    // TODO - If statement
    // //: <else stmt> ::= `else <stmt> => pass
    // //: <stmt> ::= `if # `( <exp> `) <stmt> <else stmt>? =>
    // public Statement newIf(int pos, Exp e, Statement s1, Statement s2) 
    // {
    //     return new If(pos, e, s1, s2);
    // }

    // TO DO - For Loop
    // //: <stmt> ::= # `for `( <for exp>? `; <exp>? `; <for iter>? `) <stmt> =>
    // public Statement newFor(int pos, Statement forE, Exp e, Statement forI, Statement s)
    // {
    //     return new While(pos, e, s);
    // }
    // //: <for exp> ::= <type> # ID `= <exp> =>
    // public Statement forDecl(Type t, int pos, String name, Exp e)
    // {
    //     return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, e));
    // }
    // //: <for exp> ::= <assign> => pass
    // //: <for exp> ::= <callExp> => pass
    // //: <for iter> ::= <assign> => pass
    // //: <for iter> ::= <callExp> => pass



    //================================================================
    // expressions
    //================================================================

    //: <exp> ::= <exp8> => pass
    //: <exp8> ::= <exp8> # `|| <exp7> =>
    public Exp newOr(Exp e1, int pos, Exp e2)
    {
        return new Or(pos, e1, e2);
    }

    //: <exp8> ::= <exp7> => pass
    //: <exp7> ::= <exp7> # `&& <exp6> =>
    public Exp newAnd(Exp e1, int pos, Exp e2)
    {
        return new And(pos, e1, e2);
    }

    //: <exp7> ::= <exp6> => pass
    //: <exp6> ::= <exp6> # `== <exp5> =>
    public Exp newEquals(Exp e1, int pos, Exp e2)
    {
        return new Equals(pos, e1, e2);
    }
    //: <exp6> ::= <exp6> # `!= <exp5> =>
    public Exp newNotEquals(Exp e1, int pos, Exp e2)
    {
        return new Not(pos, new Equals(pos, e1, e2));
    }

    //: <exp6> ::= <exp5> => pass
    //: <exp5> ::= <exp5> # `< <exp4> =>
    public Exp newLessThan(Exp e1, int pos, Exp e2)
    {
        return new LessThan(pos, e1, e2);
    }
    //: <exp5> ::= <exp5> # `> <exp4> =>
    public Exp newGreaterThan(Exp e1, int pos, Exp e2)
    {
        return new GreaterThan(pos, e1, e2);
    }
    //: <exp5> ::= <exp5> # `instanceof <type> =>
    public Exp newInstanceOf(Exp e, int pos, Type t)
    {
        return new InstanceOf(pos, e, t);
    }
    //: <exp5> ::= <exp5> # `<= <exp4> =>
    public Exp newLessThanEquals(Exp e1, int pos, Exp e2)
    {
        return new Not(pos, new GreaterThan(pos, e1, e2));
    }
    //: <exp5> ::= <exp5> # `>= <exp4> =>
    public Exp newGreaterThanEquals(Exp e1, int pos, Exp e2)
    {
        return new Not(pos, new LessThan(pos, e1, e2));
    }

    //: <exp5> ::= <exp4> => pass
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
    //: <exp3> ::= <exp3> # `/ <exp2> =>
    public Exp newDivide(Exp e1, int pos, Exp e2)
    {
        return new Divide(pos, e1, e2);
    }
    //: <exp3> ::= <exp3> # `% <exp2> =>
    public Exp newRemainder(Exp e1, int pos, Exp e2)
    {
        return new Remainder(pos, e1, e2);
    }

    //: <exp3> ::= <exp2> => pass
    //: <exp2> ::= # `! <exp1> =>
    public Exp newNot(int pos, Exp e)
    {
        return new Not(pos, e);
    }
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
    //: <unary exp> ::= # `+ <unary exp> =>
    public Exp newUnaryPlus(int pos, Exp e)
    {
        return new Plus(pos, new IntegerLiteral(pos, 0), e);
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
    //: <exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>* =>
    public Exp newArray(Type t, int pos, Exp e, List<Object> dummy)
    {
        return new NewArray(pos, t, e);
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
    // TO DO - Expression in parenthesis
    // //: <exp1> ::= `( <exp> `) => pass
    //: <exp1> ::= <exp1> `. # ID =>
    public Exp newInstVarAccess(Exp e, int pos, String name)
    {
        // The idea is if it is expression.length then we are doing an array lookup
        // otherwise we are doing an InstVarAccess.
        if(name.equals("length")) {
            return new ArrayLength(pos, e);
        }
        return new InstVarAccess(pos, e, name);
    }
    //: <exp1> ::= `new # ID `( `) =>
    public Exp newObject(int pos, String name)
    {
        return new NewObject(pos, new IdentifierType(pos, name));
    }
    // TO DO
    // //: <exp1> ::= <callExp> => pass

    // //: <expList> ::= <exp> <comma exp>* =>
    // public Exp newExpList(Exp e, List<Exp> elist)
    // {
    //     elist.add(0, e);
    //     return new ExpList(elist);
    // }
    // //: <comma exp> ::= `, <exp> => pass

    // //: <callExp> ::= ID `( <expList>? `)
    // //: <callExp> ::= <exp1> `. # ID `( <expList>? `) =>
    // public Exp newCall(Exp e, int pos, String name, ExpList params) 
    // {
    //     return new Call(pos, e, name, params);
    // }
    // //: <callExp> ::= `super `. # ID `( <expList>? `) =>
    // public Exp newSuperCall(int pos, String name, ExpList params) 
    // {
    //     return new Call(pos, new Super(pos), name, params);
    // }

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
