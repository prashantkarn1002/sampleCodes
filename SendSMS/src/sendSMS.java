import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class sendSMS {
	public static void generateSMS() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your API Key: ");
			// API Keys are unique for every user
			String apiKey = "apiKey=" + sc.next(); 
			String message = "&message=" + URLEncoder.encode("Greetings for the day. This msg is generated using Java.", "UTF-8");
			System.out.println("Enter the recepient contact number(starting with 91):");
			String numbers = "&numbers=" + sc.next();
			
			// Text Local is an open platform for sending bulk sms (10 per day)
			String apiURL = "https://api.textlocal.in/send/?" + apiKey + message + numbers;

			URL url = new URL(apiURL);
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line = "";
			StringBuilder sb = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				sb.append(line).append("\n");
			}

			System.out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		sendSMS.generateSMS();
	}
}