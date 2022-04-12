package API;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FirstPostmanProgram {
public void getMethodExample() throws IOException {
	URL url = new URL("www.google.com");
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
	int statusCode = connection.getResponseCode();
	System.out.println(statusCode);
	}
public static void main(String[] args) throws IOException {
	FirstPostmanProgram conex = new FirstPostmanProgram();
	conex.getMethodExample();
	
}
}
