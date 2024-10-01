import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("songque.txt");
		//doc 10 ky tu
		char buff[] = null;
		buff = new char[10] ;
		fr.read(buff);
		fr.close();
		for(int i = 0; i < 10; i++) {
			System.out.print(buff[i]);
		}
		
	}

}
