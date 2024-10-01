import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class App {

	public static void main(String[] args) throws IOException {
		//
		FileInputStream fout = null;
		fout = new FileInputStream("num.clc");
		int byteRead;
		while (true) {
			byteRead = fout.read();
			if (byteRead == -1) break;
			//ep kieu va in ra
			System.out.print(byteRead);
			System.out.print(" ");
			
		}
		System.out.println("Done.");
	}
}

/*khai bao output
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("num.clc");
		} catch (FileNotFoundException e) {
			System.out.println("Khong tim thay file");
		}
		//ghi du lieu vao file
		try {
			for(int i = 0; i <  127; i++) fout.write(i);
				fout.flush();
				fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//
		System.out.print("Done.");
*/
