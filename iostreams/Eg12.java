package iostreams;

import java.io.ByteArrayOutputStream;

public class Eg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "This is data";
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			out.write(data.getBytes());
			byte[] byteData = out.toByteArray();
			System.out.print("Data using toByteArray() : ");
			for (int i = 0; i < byteData.length; i++) {
				System.out.print((char) byteData[i]);
			}
			String stringData = out.toString();
			System.out.println("\nData using to String : " + stringData);
			out.close();
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
