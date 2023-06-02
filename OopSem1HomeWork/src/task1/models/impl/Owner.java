package task1.models.impl;

import task1.models.Gender;
import task1.models.MyDate;

public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private MyDate birthDate;

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public Owner(String firstName, String lastName, String phoneNumber, MyDate birthDate, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.gender = gender;
    }
}
