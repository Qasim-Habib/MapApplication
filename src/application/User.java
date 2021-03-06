package application;

import java.io.Serializable;

public class User extends Client implements Serializable {

	private static final long serialVersionUID = 1L;
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String payment;
	protected String email;
	protected String userName;
	protected String password;
	protected String Type;
	protected String History;

	public User(int id,String firstName, String lastName, String email, String userName, String password, String phoneNumber,
			String payment, String Type, String History) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.payment = payment;
		this.Type = Type;
		this.History = History;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int str) {
		this.id = str;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String str) {
		this.firstName = str;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String str) {
		this.lastName = str;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String str) {
		this.email = str;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String str) {
		this.userName = str;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String n) {
		this.phoneNumber = n;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String n) {
		this.payment = n;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String str) {
		this.password = str;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public void setHistory(String history) {
		History = history;
	}

	public String getHistory() {
		return History;
	}
}
