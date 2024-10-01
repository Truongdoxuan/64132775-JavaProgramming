import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		//tao file van ban, ghi vao
		FileWriter fw;
		fw = new FileWriter("songque.txt");
		//ghi 1 ky tu - write (char)
		//ghi 1 chuoi ky tu - write (String)
		fw.write("Sông quê nước chảy đôi bờ...\n");
		fw.write("Để anh chín dại mười khờ... thương...em");
		fw.flush();
		fw.close();
	}

}
