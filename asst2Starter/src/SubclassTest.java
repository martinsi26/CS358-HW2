import syntaxtree.*;
import visitor.*;
public class SubclassTest
{
    public static void main(String[] args)
    {
        DeclList v1 = new DeclList();
        DeclList v2 = new DeclList();
        DeclList v3 = new DeclList();
        DeclList v4 = new DeclList();
        DeclList v5 = new DeclList();
        DeclList v6 = new DeclList();
        ClassDeclList v0 = new ClassDeclList();
        v0.add(new ClassDecl(7,"A","Object",v1));
        v0.add(new ClassDecl(20,"B","A",v2));
        v0.add(new ClassDecl(43,"C","B",v3));
        v0.add(new ClassDecl(66,"D","C",v4));
        v0.add(new ClassDecl(89,"E","F",v5));
        v0.add(new ClassDecl(112,"F","E",v6));
        AstNode ast = new Program(1,v0);

        ast.accept(new PrettyPrintVisitor(System.out));
        ast.accept(new InheritanceVisitor());
    }
}

