public class User {
    private String userName;
    private String password;
    private String id;
    private String phoneNnumber;

    public User() {
    }

    public User(String userName, String password, String id, String phoneNnumber) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.phoneNnumber = phoneNnumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNnumber() {
        return phoneNnumber;
    }

    public void setPhoneNnumber(String phoneNnumber) {
        this.phoneNnumber = phoneNnumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", phoneNnumber='" + phoneNnumber + '\'' +
                '}';
    }
}
