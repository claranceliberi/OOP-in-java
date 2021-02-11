package Network;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 4008);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String request = "";
            String response = "";
            while (!request.equals("end")) {
                System.out.println("Write a request");
                request = bufferedReader.readLine();
                dataOutputStream.writeUTF(request);
                dataOutputStream.flush();
                response = dataInputStream.readUTF();
                System.out.println("Server response: " + response);
            }
            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}