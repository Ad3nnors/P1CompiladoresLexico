package plexico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class PLexico {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            PLexer lex = new PLexer(cs);
            Token t = null;
            FileWriter arq = new FileWriter(args[1]);
            PrintWriter gravarArq = new PrintWriter(arq);
            int i = 0, cadeia = 0, numreal = 0, variavel = 0;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                //System.out.println("<" + PLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                gravarArq.printf("<" + PLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">\n");
                i++;
                switch (PLexer.VOCABULARY.getDisplayName(t.getType())){
                    case "VARIAVEL": variavel++; break;
                    case "NUMREAL": numreal++; break;
                    case "CADEIA": cadeia++; break;
                }
            }
            gravarArq.printf("\nQuantidade total de Tokens: %d", i);
            gravarArq.printf("\nCADEIA: %d", cadeia);
            gravarArq.printf("\nNUMREAL: %d", numreal);
            gravarArq.printf("\nVARIAVEL: %d", variavel);
            arq.close();
            
        } catch (IOException ex) {
        }
    }
}