package com.company;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)  {
        try {
            ServerSocket serverSocket = new ServerSocket(4008);
            Socket socket = serverSocket.accept();
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String request = "";
            String response = "";
            while (!request.equals("end")) {
                request = dataInputStream.readUTF();
                System.out.println("Your request: " + request);
                response = bufferedReader.readLine();
                dataOutputStream.writeUTF(response);
            }
            dataInputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}