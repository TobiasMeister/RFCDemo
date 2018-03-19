package xyz.meistertobias.rfc;

import java.io.Serializable;

public class User implements Serializable {
	
	private String firstName;
	private String lastName;
	private String nickname;
	
	public User() {
	
	}
	
	public User(String firstName, String lastName, String nickname) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickname = nickname;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (User.class != obj.getClass()) return false;
		
		var other = (User) obj;
		
		return nickname.equals(other.nickname);
	}
	
	@Override
	public String toString() {
		return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", nickname='" + nickname + '\'' + '}';
	}
}
