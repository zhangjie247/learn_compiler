package parser;

import lexer.Lexer;
import lexer.Token;
import symbols.Env;

import java.io.IOException;

/**
 * Created by vince on 2015/8/10.
 */
public class Parser {
    private Lexer lex;
    private Token look;
    Env top = null;
    int used = 0;
    public Parser(Lexer l) throws IOException{lex = l; move();}
    void move() throws IOException{ look = lex.scan();}
    void error(String s){throw new Error("near line " + lex.line + ": " + s);}
    void match(int t) throws IOException{
        if (look.tag == t) move();
        else error("syntax error");
    }
}
