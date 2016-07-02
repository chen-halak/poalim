import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
 private String privateName;
private String lastName;
@Id 
private String username;
private String password;
private double money;
public String getPrivateName() {
	return privateName;
}
public void setPrivateName(String privateName) {
	this.privateName = privateName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
}
}
