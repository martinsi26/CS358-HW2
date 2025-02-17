package visitor;

import syntaxtree.*;
import java.util.*;

public class InheritanceVisitor extends Visitor
{
    public Object visit(ClassDecl cd)
    {
        System.out.println(cd.name + " <: " + cd.superName);
        return null;
    }
}
