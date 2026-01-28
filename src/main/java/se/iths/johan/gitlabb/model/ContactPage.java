package se.iths.johan.gitlabb.model;

public class ContactPage {
    private String phoneNumber;
    private String email;
    private String address;

    public ContactPage(String phoneNumber, String email, String address) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
