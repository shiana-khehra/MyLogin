package ca.sait.mylogin.models;

import java.io.Serializable;

/**
 *
 * @author Shiana Khehra
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public User() {
    
    }
    
    public User(String username, String passowrd) {
        
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
    
}
