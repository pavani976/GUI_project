package Datagram_Programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class datagramclient {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket=new DatagramSocket(777);
        byte[] buffer=new byte[30];
        DatagramPacket datagramPacket=new DatagramPacket(buffer,25);
        datagramSocket.receive(datagramPacket);
        String msg=new String(datagramPacket.getData());
        System.out.println(msg);
        datagramSocket.close();
    }
}