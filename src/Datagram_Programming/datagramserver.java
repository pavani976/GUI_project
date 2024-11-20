package Datagram_Programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class datagramserver {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket=new DatagramSocket();
        String msg="hi client welcome our project....";
        InetAddress ip=InetAddress.getByName("localhost");
        DatagramPacket datagramPacket=new DatagramPacket(msg.getBytes(),msg.length(),ip,777);
        datagramSocket.send(datagramPacket);
    }
}
