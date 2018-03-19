package xyz.meistertobias.rfc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepo implements UserRepoRFC {
	
	private static List<User> users = new ArrayList<>();
	
	@Override
	public List<User> getUsers() {
		return users;
	}
	
	@Override
	public User getUser(String nickname) {
		return findUser(nickname).orElse(null);
	}
	
	@Override
	public void addUser(User user) {
		if (!users.contains(user)) users.add(user);
	}
	
	@Override
	public void deleteUser(String nickname) {
		findUser(nickname).ifPresent(users::remove);
	}
	
	private Optional<User> findUser(String nickname) {
		return users.stream().filter(user -> user.getNickname().equals(nickname)).findFirst();
	}
}
