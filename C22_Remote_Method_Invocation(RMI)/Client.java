package Chapter21_RMI;

import java.rmi.Naming;

class Client {
    public static void main(String[] args) {
        try {
            RemoteInterface obj = (RemoteInterface) Naming.lookup("//localhost/RemoteServer");
            String data = "Hello from client";
            String response = obj.sendData(data);
            System.out.println("Response from server: " + response);
            String serverMessage = obj.receiveData();
            System.out.println("Message from server: " + serverMessage);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
