
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyMain {

	private static BufferedReader buff;

	public static void main(String[] args) {
		try {
			LexicalAnalysis lex = new LexicalAnalysis();

			buff = new BufferedReader(new FileReader(new File("My_Input.txt")));
			String codeOneLine = null;
			boolean eof = false;

			while (!eof) {
				codeOneLine = buff.readLine();
				if (codeOneLine != null) {

					lex.setSourceCodeInOneLine(codeOneLine);
					lex.stringToCharArray();
					lex.checkEachChar();
					lex.writeToFile();
				} else
					eof = true;
			}
		} catch (ArrayIndexOutOfBoundsException oob) {
			System.out.println("  <--- Systax error here.");
		} catch (FileNotFoundException fnf) {
			System.out.println("--- File not found ---");
		} catch (Exception ex) {
			System.out.println("--- Exception --- "+ex);
		}
	}
}