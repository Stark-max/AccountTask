package models.entities;

public class Address {
    public String street;
    public String city;
    public String building;
    public int post;

    public Address() {
    }

    public Address(String street, String city, String building, int post) {
        this.street = street;
        this.city = city;
        this.building = building;
        this.post = post;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }
}
