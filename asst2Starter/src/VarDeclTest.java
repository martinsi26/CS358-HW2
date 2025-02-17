import syntaxtree.*;
import visitor.*;
public class VarDeclTest
{
    public static void main(String[] args)
    {
        VarDeclList v2 = new VarDeclList();
        v2.add(new FormalDecl(43,new IntegerType(39),"a"));
        v2.add(new FormalDecl(50,new IntegerType(46),"b"));
        v2.add(new FormalDecl(57,new IntegerType(53),"c"));
        ExpList v7 = new ExpList();
        ExpList v9 = new ExpList();
        v9.add(new True(314));
        StatementList v8 = new StatementList();
        v8.add(new LocalDeclStatement(276,new LocalVarDecl(276,new IdentifierType(272,"Dog"),"d",new NewObject(280,new IdentifierType(280,"Dog")))));
        v8.add(new CallStatement(309,new Call(309,new IdentifierExp(307,"c"),"zoom",v9)));
        ExpList v11 = new ExpList();
        StatementList v10 = new StatementList();
        v10.add(new LocalDeclStatement(387,new LocalVarDecl(387,new IdentifierType(382,"Doug"),"d",new NewObject(391,new IdentifierType(391,"Doug")))));
        v10.add(new CallStatement(421,new Call(421,new IdentifierExp(419,"d"),"say_hi",v11)));
        StatementList v6 = new StatementList();
        v6.add(new LocalDeclStatement(163,new LocalVarDecl(163,new IdentifierType(156,"String"),"u",new NewObject(167,new IdentifierType(167,"String")))));
        v6.add(new LocalDeclStatement(197,new LocalVarDecl(197,new IdentifierType(193,"Cat"),"c",new NewObject(201,new IdentifierType(201,"Cat")))));
        v6.add(new If(224,new Call(229,new IdentifierExp(227,"c"),"is_orange",v7),new Block(254,v8),new Block(364,v10)));
        StatementList v5 = new StatementList();
        v5.add(new Block(142,v6));
        v5.add(new Assign(129,new IdentifierExp(129,"i"),new Plus(130,new IdentifierExp(129,"i"),new IntegerLiteral(130,1))));
        StatementList v4 = new StatementList();
        v4.add(new LocalDeclStatement(115,new LocalVarDecl(115,new IntegerType(111),"i",new IntegerLiteral(119,0))));
        v4.add(new While(107,new LessThan(124,new IdentifierExp(122,"i"),new IdentifierExp(126,"c")),new Block(107,v5)));
        ExpList v12 = new ExpList();
        StatementList v3 = new StatementList();
        v3.add(new LocalDeclStatement(81,new LocalVarDecl(81,new IdentifierType(74,"Object"),"o",new NewObject(85,new IdentifierType(85,"Object")))));
        v3.add(new Block(107,v4));
        v3.add(new LocalDeclStatement(469,new LocalVarDecl(469,new IdentifierType(463,"Pants"),"p",new NewObject(473,new IdentifierType(473,"Pants")))));
        v3.add(new LocalDeclStatement(498,new LocalVarDecl(498,new IntegerType(494),"d",new Call(504,new IdentifierExp(502,"p"),"get_width",v12))));
        VarDeclList v13 = new VarDeclList();
        v13.add(new FormalDecl(546,new IntegerType(542),"c"));
        v13.add(new FormalDecl(553,new IntegerType(549),"u"));
        v13.add(new FormalDecl(560,new IntegerType(556),"p"));
        StatementList v15 = new StatementList();
        v15.add(new LocalDeclStatement(645,new LocalVarDecl(645,new BooleanType(637),"b",new Minus(655,new Plus(651,new IdentifierExp(649,"c"),new IdentifierExp(653,"u")),new IdentifierExp(657,"p")))));
        StatementList v16 = new StatementList();
        StatementList v14 = new StatementList();
        v14.add(new LocalDeclStatement(585,new LocalVarDecl(585,new BooleanType(577),"a",new Plus(591,new IdentifierExp(589,"c"),new IdentifierExp(593,"u")))));
        v14.add(new If(604,new Equals(609,new IdentifierExp(607,"a"),new IntegerLiteral(612,2)),new Block(623,v15),new Block(674,v16)));
        DeclList v1 = new DeclList();
        v1.add(new MethodDeclVoid(37,"f",v2,v3));
        v1.add(new MethodDeclVoid(540,"d",v13,v14));
        ClassDeclList v0 = new ClassDeclList();
        v0.add(new ClassDecl(7,"VarDeclTest","Object",v1));
        AstNode ast = new Program(1,v0);

        ast.accept(new PrettyPrintVisitor(System.out));
        ast.accept(new VarDeclVisitor());
    }
}

