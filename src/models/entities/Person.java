package models.entities;

public class Person {
    private int id;
    public String fullName;
    public Address regAddress;
    public Address actualAddress;

    public Person() {
    }

    public Person(int id, String fullName, Address regAddress, Address actualAddress) {
        this.id = id;
        this.fullName = fullName;
        this.regAddress = regAddress;
        this.actualAddress = actualAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(Address regAddress) {
        this.regAddress = regAddress;
    }

    public Address getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(Address actualAddress) {
        this.actualAddress = actualAddress;
    }
}
