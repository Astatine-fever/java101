package Chapter21_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String sendData(String data) throws RemoteException;
    String receiveData() throws RemoteException;
}
