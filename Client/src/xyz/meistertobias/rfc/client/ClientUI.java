package xyz.meistertobias.rfc.client;

import xyz.meistertobias.rfc.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ClientUI {
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		var registry = LocateRegistry.getRegistry(Config.DEFAULT_PORT);
		
		// RFC: calc
		{
			var calc = (CalcRFC) registry.lookup(Calc.class.getName());
			
			// add
			System.out.println(calc.add(5, 9));
			
			// subtract
			System.out.println(calc.subtract(5, 9));
			
			// multiply
			System.out.println(calc.multiply(5, 9));
			
			// divide
			System.out.println(calc.divide(5, 9));
		}
		
		System.out.println();
		
		// RFC: user
		{
			var userRepo = (UserRepoRFC) registry.lookup(UserRepo.class.getName());
			
			// addUser
			var user = new User("Marcel", "Davis", "Leiter für Kundenzufriedenheit");
			userRepo.addUser(user);
			
			// getUsers
			userRepo.getUsers().forEach(System.out::println);
			
			// getUser
			System.out.println(userRepo.getUser("Leiter für Kundenzufriedenheit"));
			
			// deleteUser
			userRepo.deleteUser("Leiter für Kundenzufriedenheit");
		}
	}
}
