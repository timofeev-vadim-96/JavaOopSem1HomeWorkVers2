package task1.models.impl;

import task1.models.Gender;
import task1.models.MyDate;
import task1.models.Speakable;

import java.time.LocalDate;

public class Cat implements Speakable {
    private String name;
    private MyDate birthDate;
    private Owner owner;
    private Gender gender;

    public Cat(String name, MyDate birthDate, Owner owner, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.owner = owner;
        this.gender = gender;
    }

    @Override
    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Я %s. Мне %s года(лет). Мой владелец - %s %s", this.name, getCatsGender(),
                getAge(), this.owner.getFirstName(), this.owner.getLastName());
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthDate.getYear();
        return age;
    }

    public String getCatsGender(){
        if (this.gender.equals(Gender.М)) return "мальчик";
        else return "девочка";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
