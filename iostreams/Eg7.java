package iostreams;
import java.io.FileOutputStream;

public class Eg7 {

	public static void main(String[] args) {

		FileOutputStream out = null;
		String data = "This is method of flash method";
		try {
			out = new FileOutputStream("flush.txtx");
			out.write(data.getBytes());
			out.flush();
			out.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
