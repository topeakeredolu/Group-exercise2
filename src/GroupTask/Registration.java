package GroupTask;

public class Registration {
    private String  email, userName, password;
    public Registration(String email, String userName,
                        String password){
        this.email=email;
        this.userName=userName;
        this.password=password;
    }
    public void setEmail(){
        if(email.contains("yahoo")){
            this.email=email;
        }else{
            System.out.println("Error");
        }
    } public void setUserName(){
        if(!userName.isEmpty() && userName.length() > 6){
            this.userName = userName;
        }else{
            System.out.println("Error Username");
        }
    } public void setPassword() {
        if (!password.isEmpty() && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Error Password");
        }
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}
class RegistrationTester{
    public static void main(String[] args) {
        Registration  r = new Registration("ogo@gmail.com", "MyUsername123", "Abracadabra");
        System.out.println(r.getEmail());
        System.out.println(r.getUsername());
        System.out.println(r.getPassword());
    }
}