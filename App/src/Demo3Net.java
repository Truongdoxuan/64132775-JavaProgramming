import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

public class Demo3Net {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://ntu.edu.vn/default.aspx");
		//gui yeu cau ket noi
		//giong nhu chung ta nhap URL
		URLConnection connection = url.openConnection();
		
		//sever tra ve ket qua thong qua luong
		//ta dung luong inputStream de nhan ket qua
		InputStream inputStream = connection.getInputStream();

		InputStreamReader iReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(iReader);
		String lineString;
		while(true) {
			lineString = bufferedReader.readLine();
			if (lineString == null) break;
			System.out.println(lineString);
		}
	}

}
