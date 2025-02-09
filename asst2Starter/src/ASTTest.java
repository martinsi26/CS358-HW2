import syntaxtree.*;
import visitor.*;
public class ASTTest
{
    public static void main(String[] args)
    {
        AstNode ast = ast3();

        ast.accept(new PrettyPrintVisitor(System.out));
    }

    public static AstNode ast1()
    {
        ClassDeclList decls = new ClassDeclList();
        DeclList methods = new DeclList();
        decls.add(new ClassDecl(0,"Main","Object",methods));

        return new Program(0,decls);
    }

    public static AstNode ast2()
    {
        ClassDeclList decls = new ClassDeclList();
        MethodDecl method1 = new MethodDeclNonVoid(0, new IntegerType(0), "foo",
                                                    new VarDeclList(), new StatementList(),
                                                    new IntegerLiteral(0,4));
        DeclList methods = new DeclList();
        methods.append(method1);
        decls.add(new ClassDecl(0,"Main","Object",methods));

        return new Program(0,decls);
    }

    public static AstNode ast3()
    {
        ClassDeclList decls = new ClassDeclList();
        IntegerType intType = new IntegerType(0);
        VarDeclList varDecls = new VarDeclList();

        StatementList statements = new StatementList();
        statements.append(new LocalDeclStatement(0, 
                            new LocalVarDecl(0, intType, "i", new IntegerLiteral(0, 0))));

        IdentifierExp i = new IdentifierExp(0, "i");
        LessThan less = new LessThan(0, i, new IntegerLiteral(0, 10));
        Plus add = new Plus(0, i, new IntegerLiteral(0, 1));
        Assign assign = new Assign(0, i, add);

        statements.append(new While(0, less, assign));

        MethodDecl method1 = new MethodDeclNonVoid(0, intType, "foo",
                                                    varDecls, statements,
                                                    new IntegerLiteral(0, 4));
        DeclList methods = new DeclList();
        methods.append(method1);
        decls.add(new ClassDecl(0,"Main","Object",methods));

        return new Program(0,decls);
    }
}