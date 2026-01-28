package se.iths.johan.gitlabb.model;

public class Profile {
    String biography;
    String profilepic;
    String name;

    public Profile(String biography, String profilepic, String name) {
        this.biography = biography;
        this.profilepic = profilepic;
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

