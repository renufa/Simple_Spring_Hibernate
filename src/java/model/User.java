package model;
// Generated Jan 25, 2018 2:42:44 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private int id;
     private String userName;
     private int password;
     private String email;

    public User() {
    }

    public User(int id, String userName, int password, String email) {
       this.id = id;
       this.userName = userName;
       this.password = password;
       this.email = email;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getPassword() {
        return this.password;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


