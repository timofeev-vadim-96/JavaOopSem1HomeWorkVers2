package task1;

import task1.models.Gender;
import task1.models.MyDate;
import task1.models.impl.Cat;
import task1.models.impl.Owner;

public class Main {
    public static void main(String[] args) {
        Owner catOwner = new Owner("Алексей", "Иванов", "+79813339993",
                new MyDate(1996, 10,06), Gender.М);
        Cat cat1 = new Cat("Пушистик", new MyDate(2019, 1, 14), catOwner, Gender.М);
        cat1.greet();
    }
}