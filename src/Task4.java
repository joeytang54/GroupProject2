public class Task4 {}
    /*
    Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and in each method
    separately pass values to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.
     */
    class Registration{
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email){
            if (email.contains("yahoo")){
                this.email = email;
                System.out.println("Your "+this.email+" is valid");
            }else{
                System.out.println("Your email is invalid. Only Yahoo email");
            }
        }
        public void setUserName(String userName){
            if (!userName.isEmpty() && userName.length()>6){
                this.userName = userName;
                System.out.println("Your username is valid");
            }else{
                System.out.println("Your username is invalid. It cannot be emptied or less than 6 characters");
            }
        }
        public void setPassword(String password) {
            if (!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
                this.password = password;
                System.out.println("Your password is valid. You are all set.");
            }else{
                System.out.println("You password is invalid. Please make sure it is not empty or less than 6 characters " +
                        "or same as username");
            }
        }
    }
    class RegistrationTester{
        public static void main(String[] args) {
            Registration registration=new Registration();
            registration.setEmail("hello@yahoo.com");
            registration.setEmail("hello@gmail.com");
            registration.setUserName("HelloWorld");
            registration.setUserName("Hello");
            registration.setUserName("");
            registration.setPassword("thankyou");
            registration.setPassword("");
            registration.setPassword("thank");
            registration.setPassword("HelloWorld");

        }
    }

