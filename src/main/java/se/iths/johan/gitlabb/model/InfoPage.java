package se.iths.johan.gitlabb.model;


public class InfoPage {


    String About;
    String Address;
    String PhoneNumber;


    public InfoPage(String about, String address, String phoneNumber) {
        About = about;
        Address = address;
        PhoneNumber = phoneNumber;
    }


    public String getAbout() {
        return About;
    }


    public void setAbout(String about) {
        About = about;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public String getPhoneNumber() {
        return PhoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
