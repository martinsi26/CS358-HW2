package visitor;

import syntaxtree.*;
import java.util.*;

public class VarDeclVisitor extends Visitor
{
    public Object visit(VarDecl vd)
    {
        System.out.print("Variable " + vd.name + " Type ");
        vd.type.accept(new PrettyPrintVisitor(System.out));
        System.out.println(" ID " + vd.pos);
        return null;
    }
}