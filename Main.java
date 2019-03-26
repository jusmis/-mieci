import java.io.File;
import java.io.IOException;

public class Main {

	public static void main (String ... args) {

		try{
			File f = new File("Plik.txt");
			if(!file.exists()) {
            		file.createNewFile();
			genString(1000);
		}catch (FileNotFoundException e){
			System.out.println("Blad pliku");
			System.out.println(e.getMessage());
		}
			
	}

	public static void genString(int len) {
    		String s = "";
    		for (int i = 1 ; i < len ; i++) {
        		s += (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
			System.out.println(s);
		}
    		//return s;
	}

}
