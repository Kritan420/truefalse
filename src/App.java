import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Statements> list = new ArrayList<Statements>();

        Scanner s = new Scanner(new File("./src/statements.txt"), "UTF-8");
		s.useDelimiter("=");

        while (s.hasNextLine())  {
            list.add(new Statements(s.next(), s.next()));
        }

        new GUI(list);

        s.close();

    }
    
}
