package com.example.lab04_180041130_task3;



import java.io.Serializable;

public class LoginBean implements Serializable {

    String username;
    String password;
    Boolean valid=false;
    public void setUsername(String username){
        this.username=username;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public Boolean getValid() {
       if(username.equals("galib130")&&password.equals("1234")){
           valid=Boolean.TRUE;
       }
       else
           valid=Boolean.FALSE;

        return valid;
    }


}
