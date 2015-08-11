package main;
import lexer.Lexer;
import parser.Parser;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Lexer lex = new Lexer();
        Parser parser = new Parser(lex);
        parser.program();
        System.out.println('\n');
    }
}
