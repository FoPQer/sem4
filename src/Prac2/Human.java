package Prac2;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    int age, weight;
    String firstName, lastName;
    LocalDate birthDate;
    Scanner sc = new Scanner(System.in);

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(int day, int month, int year) {
        birthDate = LocalDate.of(year, month, day);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    Human(){
        System.out.println("Введите возраст");
        setAge(sc.nextInt());
        System.out.println("Введите имя");
        sc.nextLine();
        setFirstName(sc.nextLine());
        System.out.println("Введите фамилию");
        setLastName(sc.nextLine());
        System.out.println("Введите дату рождения в формате ДД ММ ГГГГ");
        setBirthDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Введите вес");
        setWeight(sc.nextInt());
    }
}
