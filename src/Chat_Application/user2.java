package Chat_Application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class user2 extends Frame implements Runnable,ActionListener {
    TextField textField;
    TextArea textArea;
    Button send;
    Socket socket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    Thread chat;

    user2() {
        textField = new TextField();
        textField.setBounds(50,500,400,30);

        textArea = new TextArea();
        textArea.setBounds(50,50,500,400);

        send = new Button("Send..");
        send.setBounds(460,500,80,30);
        send.addActionListener(this);

        try {
            socket = new Socket("localhost", 1234);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

        } catch (Exception e) {
            System.out.println(e);
        }

        add(textField);
        add(textArea);
        add(send);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        chat = new Thread(this);
        chat.setDaemon(true);
        chat.start();

        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setTitle("Moon....");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = textField.getText();
        textArea.append(" " + msg + "\n");
        textField.setText("");
        try {
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        } catch (IOException a) {
            System.out.println(a);
        }
    }

    public void run() {
        while (true) {
            try {
                String msg = dataInputStream.readUTF();
                textArea.append(" " + msg + "\n");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]) {
        new user2();
    }
}

