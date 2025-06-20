package com.server;

import com.Main;
import com.utils.Env;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Timestamp;
import java.util.Date;

public class ServiceClient implements Runnable {

    private Socket clientSocket;
    private BufferedReader in = null;

    public ServiceClient(Socket client) {
        this.clientSocket = client;
        try {
            this.clientSocket.setKeepAlive(true);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
    boolean isIP = false;
    String clientIPAddress = "";
    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(
                    clientSocket.getInputStream()));
            String clientSelection;
            while ((clientSelection = in.readLine()) != null) {
                switch (clientSelection) {
//                    case "1":
//                        receiveFile();
//                        String[] s = {"apk\\"};
//                        Main.main(s);
//                        continue;
//                    case "2":
//                        String outGoingFileName;
//                        while ((outGoingFileName = in.readLine()) != null) {
//                            sendFile(outGoingFileName);
//                        }
//                        continue;
//                    case "3":
//                        System.exit(1);
//                        break;
                    default:
                        System.out.println("CLIENT clientSelection>> "+clientSelection);
                        if(!isIP) {
                            clientIPAddress = clientSelection;
                            System.out.println("CLIENT IP>> "+clientIPAddress);

                            isIP = true;
                        }
                        receiveFile();
                        String[] s = {"apk\\"};
                        Main.main(s);
                        System.out.println("Received File.");
                        String dir = System.getProperty("user.dir");
                        sendFile(dir+"\\apk\\Stats_042241.xlsx");
                        continue;
                }
            }
//            isIP = false;

        } catch (IOException ex) {
        }
    }

    public void receiveFile() {
        try {
            int bytesRead;

            DataInputStream clientData = new DataInputStream(clientSocket.getInputStream());

            String fileName = clientData.readUTF();
            OutputStream output = new FileOutputStream(fileName);
            long size = clientData.readLong();
            byte[] buffer = new byte[1024];
            while (size > 0 && (bytesRead = clientData.read(buffer, 0, (int) Math.min(buffer.length, size))) != -1) {
                output.write(buffer, 0, bytesRead);
                size -= bytesRead;
            }

            output.flush();
//            output.close();
//            clientData.close();
            File dir = new File("apk\\");
            if(dir.exists())
                dir.delete();
            dir.mkdir();

            FileUtils.copyFile(new File(fileName), new File("apk\\"+fileName));
            new File(fileName).delete();

            System.out.println("File "+fileName+" received from client.");
        } catch (IOException ex) {
            System.err.println("Client error. Connection closed.");
        }
    }

    public void sendFile(String fileName) {
        System.out.println("SENDING FILE "+clientSocket.isConnected());
//        try {
//            System.out.println("SENDING FILE "+clientSocket.getKeepAlive());
//        } catch (SocketException e) {
//            e.printStackTrace();
//        }

//        String host = "192.168.43.172";
        try {
//            System.out.println("clientIPAddress>>>>>>>> "+clientIPAddress);
//            clientSocket = new Socket(clientIPAddress, 5555);
//            try {
//                clientSocket.setKeepAlive(true);
//            } catch (SocketException e) {
//                e.printStackTrace();
//            }

            PrintStream pos = new PrintStream(clientSocket.getOutputStream());
            pos.println(Env.convertedJson);

//            File file = new File(fileName);
//            byte[] mybytearray = new byte[(int) file.length()];
//            FileInputStream fis = new FileInputStream(file);
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            //bis.read(mybytearray, 0, mybytearray.length);
//
//            DataInputStream dis = new DataInputStream(bis);
//            dis.readFully(mybytearray, 0, mybytearray.length);
//

//            OutputStream os = clientSocket.getOutputStream();
//
//            //Sending file name and file size to the server
//            DataOutputStream dos = new DataOutputStream(os);
//            dos.writeUTF(file.getName());
//            dos.writeLong(mybytearray.length);
//            dos.write(mybytearray, 0, mybytearray.length);
//            dos.flush();
//            os.flush();
//            dos.close();
//                socket.close();
//            System.out.println("File "+file.getName()+" sent to Server.");
        } catch (IOException e) {
            System.err.println("File does not exist!");
            e.printStackTrace();
        }
    }
}