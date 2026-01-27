package se.iths.johan.gitlabb.model;

public class Kundservice {
    String mail;
    String phoneNumber;
    String openingTime;

    public Kundservice(String mail, String phoneNumber, String openingTime) {
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.openingTime = openingTime;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }
}
