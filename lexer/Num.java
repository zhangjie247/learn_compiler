package lexer;
public class Num extends Token {
    public final int value;
    public Num(int t){super(Tag.Num); value = v;}
    public String toString(){return "" + value; }
}
