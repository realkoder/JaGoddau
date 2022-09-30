package friendswithdata;

public class Friend {
    private String name;
    private String phoneNum;
    private String email;

    @Override
    public String toString() {
        return "Friend {" +
                "name is " + name + ", phoneNum is " + phoneNum +
                ", email='" + email + '\'' +
                '}';
    }

    public Friend(String name, String phoneNum, String email) {
        setName(name);
        setPhoneNum(phoneNum);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
