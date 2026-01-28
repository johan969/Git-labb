package se.iths.johan.gitlabb.model;

import java.util.List;

public class Kundservice {
    String mail;
    List<String> phoneNumber;
    String openingTime;

    public Kundservice(String mail, List<String> phoneNumber, String openingTime) {
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

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }
}
