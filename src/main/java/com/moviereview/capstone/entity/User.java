package com.moviereview.capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)

    private long user_id;
    
    private String first_name;
    
    private String last_name;
    
    private String email; 
    
    private String user_name;

    private String pass_word;
    
    public User()
    {
    	
    }

	public User(String first_name, String last_name, String email, String user_name, String pass_word) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.user_name = user_name;
		this.pass_word = pass_word;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPass_word() {
		return pass_word;
	}

	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
    
}
