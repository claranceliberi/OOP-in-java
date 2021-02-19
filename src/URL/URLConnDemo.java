package URL;

// File Name : URLConnDemo.java
import java.net.*;
import java.io.*;

public class URLConnDemo {

    public static void main(String [] args) {
        try {
            URL url = new URL("https://www.amrood.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            }else {
                System.out.println("Please enter an HTTP URL.");
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder urlString = new StringBuilder();
            String current;

            while((current = in.readLine()) != null) {
                urlString.append(current);
            }
            System.out.println(urlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
