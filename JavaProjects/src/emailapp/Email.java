package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private int deaultPasswordLength=10;
	private String alternateEmail;
	private String email;
	private String companySufix="aeycompany.com";
	//constructor to received the fristName and lastName
	
	public Email(String firstNamr, String lastName) {
		this.firstName=firstNamr;
		this.lastName=lastName;
	
		
		this.department=setDepartment();
		System.out.println("Department:"+this.department);
		
		this.password=randomPassword(deaultPasswordLength);
		System.out.println("Your password  is :"+this.password);
		
		email=firstNamr.toLowerCase()+"."+lastName.toLowerCase() +"@"+department+"." +companySufix;
	
		
	}
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1 for the Sales\n2 for Development \n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in=new Scanner(System.in);
		
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acct";}
		else { return "";}
		
	}
	// Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRUVWXYZ0123456789!@#$%*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String (password);
		
	}
	//set the mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	//set the alternate email
	
	public void SetAlternateEmail(String altemail) {
		this.alternateEmail=altemail;
	}
	
	//change the passowrd
	
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME      :"+firstName+" "+lastName+"\n"+
				"CAMPANY EMAIL    :"+email+"\n"+
				"MAILBOX CAPACITY :"+mailboxCapacity+"mb";
	}

}
