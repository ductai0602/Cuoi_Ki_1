package model;

public class Account {
	private String user_name;
	private String pass;
	@Override
	public String toString() {
		return "Account [user_name=" + user_name + ", pass=" + pass + ", pass_conf=" + pass_conf + "]";
	}
	private String pass_conf;
	public Account() {
	}
	public Account(String user_name, String pass, String pass_conf) {
		this.user_name = user_name;
		this.pass = pass;
		this.pass_conf = pass_conf;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass_conf() {
		return pass_conf;
	}
	public void setPass_conf(String pass_conf) {
		this.pass_conf = pass_conf;
	}
	
}
