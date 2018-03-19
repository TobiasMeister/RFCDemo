package xyz.meistertobias.rfc.server;

import xyz.meistertobias.rfc.*;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServerUI {
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		var calc = new Calc();
		var calcRFC = (CalcRFC) UnicastRemoteObject.exportObject(calc, 0);
		
		var userRepo = new UserRepo();
		var userRepoRFC = (UserRepoRFC) UnicastRemoteObject.exportObject(userRepo, 0);
		
		var registry = LocateRegistry.createRegistry(Config.DEFAULT_PORT);
		registry.bind(Calc.class.getName(), calcRFC);
		registry.bind(UserRepo.class.getName(), userRepoRFC);
	}
}
