
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class Server extends UnicastRemoteObject implements RemoteInterface {
    protected Server() throws RemoteException {
        super();
    }

    public String sendData(String data) throws RemoteException {
        System.out.println("Data received from client: " + data);
        return "Data received successfully by server";
    }

    public String receiveData() throws RemoteException {
        return "Hola amigo";
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
            Server obj = new Server();
            java.rmi.Naming.rebind("//localhost/RemoteServer", obj);
            System.out.println("Server ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
