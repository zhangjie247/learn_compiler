package main;
import lexer.Lexer;
import parser.Parser;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\workspaces\\learn_compiler\\main\\input.c"));
            String thisLine;
            while ((thisLine = br.readLine()) != null) {
                //System.out.println(thisLine);
                sb.append(thisLine);
            }
        }
        catch (IOException e) {
            System.err.println("Error: " + e);
        }
        Lexer lex = new Lexer(sb.toString());
        Parser parser = new Parser(lex);
        parser.program();
        System.out.println('\n');
    }
}
