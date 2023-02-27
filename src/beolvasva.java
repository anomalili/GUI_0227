import emberek.txt;
import java.io.File;
import java.util.Scanner;


/**
 *
 * @author makra.zs.lili
 */
public class beolvasva {
    
        public static void main(String[] args) throws Exception
    {
    
    File fajl = new File("src\\model\\emberek.txt");
    Scanner sc = new Scanner(fajl);
    
    
  
    sc.useDelimiter(";Z");
    
        System.out.println(sc.next());
    
    
    }
    
}
