import java.util.Random;

public class User {
    private final int userID;
    private String userName;
    private String password;
    private String userEmail;
    private int userRole;

    public User(String userName, String password, String userEmail, int userRole) {
        this.userID = 1;
        this.userName = userName;
        this.password = password;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }
    public int getUserID() {return userID;}
    public String getUserName() {return userName;}
    public String getPassword() {return password;}
    public String getUserEmail() {return userEmail;}
    public int getUserRole() {return userRole;}
    public void setUserRole(int userRole) {this.userRole = userRole;}
    public void setUserName(String userName) {this.userName = userName;}
    public void setPassword(String password) {this.password = password;}
    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}

    public int generateRandomId() {
        //TODO add ID checking for if ID exists
        Random randIdGenerator = new Random();

        return 100000 + randIdGenerator.nextInt(900000);
    }
}
