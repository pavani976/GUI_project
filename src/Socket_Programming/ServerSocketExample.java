package Socket_Programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

 class ServerSocketExample {
    public static void main(String[] args) throws IOException {
            ServerSocket serversocket = new ServerSocket(9999);
            Socket socket = serversocket.accept();

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("Welcome clint........");
            dataOutputStream.flush();
            dataOutputStream.close();
    }
}