package inter;

import symbols.Type;

/**
 * Created by vince on 2015/8/10.
 */
public class Do extends Stmt {
    Expr expr; Stmt stmt;
    public void Do(){expr = null; stmt = null;}
    public void init(Stmt s, Expr x){
        expr = x; stmt = s;
        if (expr.type != Type.Bool) expr.error("boolean required in do");
    }
    public void gen(int b, int a){
        after = a;
        int label = newlabel();
        stmt.gen(b,label);
        emitlabel(label);
        expr.jumping(b,0);
    }
}
