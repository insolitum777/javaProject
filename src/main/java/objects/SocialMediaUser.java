package objects;

import strings.StringReplace;

public class SocialMediaUser {
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;


    public boolean login(String username1, String password1) {

        if (username.equals(username1)) {

            return true;
        }
        if (password.equals(password1)) {
            return true;


        } else {
            System.out.println("Invalid username or password");
        }return false;

    }


    public void setPassword(String newpassword){
        this.password.equals(newpassword);
        }

        public String getFullName() {
            String fullName = firstName + " " + lastName;
            return fullName;

        }

        public boolean isAdult(int age ){
        if (age >= 18 ){
            return true;
        }else {
            return false;
        }

        }

    public static void main(String[] args) {

    }














    }
















