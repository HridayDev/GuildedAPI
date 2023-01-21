import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CreateChannelOnServer {

	String url = "https://www.guilded.gg/api/v1/channels";
	String method = "POST";
	String token = "gapi_b9cx979KtGQeMSsVC8YYr4F6JTUpo6vu+1Zw4uPNPeRfz1Lranjxy9W0WcEL9Uop7/xAxlSjzEa9lJbd2zDq4Q==";

	public static void main(String[] args) throws Exception {
		new CreateChannelOnServer();
	}

	public CreateChannelOnServer() throws Exception {

		HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		con.setDoOutput(true);
		con.setRequestMethod(method);
		con.setRequestProperty("Authorization", "Bearer " + token);

		DataOutputStream outputStream = new DataOutputStream(con.getOutputStream());
		outputStream.writeBytes("{\"name\":\"The Dank Cellar\",\"type\":\"chat\"}");
		outputStream.close();
		System.out.println("a");
//		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
//		br.close();
//		System.out.println(br.readLine());
	}
}