package xyz.meistertobias.rfc;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserRepoRFC extends Remote {
	
	List<User> getUsers() throws RemoteException;
	
	User getUser(String nickname) throws RemoteException;
	
	void addUser(User user) throws RemoteException;
	
	void deleteUser(String nickname) throws RemoteException;
}
