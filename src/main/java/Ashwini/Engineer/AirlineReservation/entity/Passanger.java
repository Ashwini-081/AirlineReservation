package Ashwini.Engineer.AirlineReservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passanger {
    @Id
    private String userName;
    private String name;
    private String address;
    private String gender;
    private int age;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    long phoneNumber;

    public Passanger(String userName, String name, String address, String gender, int age, String email, String password, long phoneNumner) {
        this.userName = userName;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumner;
    }
    public Passanger(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumner() {
        return phoneNumber;
    }

    public void setPhoneNumner(long phoneNumner) {
        this.phoneNumber = phoneNumner;
    }




}
