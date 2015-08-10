package inter;

/**
 * Created by vince on 2015/8/10.
 */
public class Break extends Stmt {
    Stmt stmt;
    public Break(){
        if (Stmt.Enclosing == Stmt.Null) error("unenclosed break");
        stmt = Stmt.Enclosing;
    }
    public void gen(int b, int a){
        emit("goto L" + stmt.after);
    }
}
