package ua.lviv.lgs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Deputy extends Human{
    String name;
    String surname;
    String fraction;
    int age;
    boolean bribeTaker;
    int bribeSum;


    Deputy(int height, int weight, String name, String surname, String fraction, int age, boolean bribeTaker, int bribeSum) {
        super(height, weight);
        this.name = name;
        this.surname = surname;
        this.fraction = fraction;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fraction='" + fraction + '\'' +
                ", age=" + age +
                ", bribeTaker=" + bribeTaker +
                ", bribeSum=" + bribeSum +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public int getBribeSum() {
        return bribeSum;
    }

    public void setBribeSum(int bribeSum) {
        this.bribeSum = bribeSum;
    }

    public void giveBribe(Deputy d) {
        if (d.isBribeTaker()) {
            System.out.println("Enter bribe sum: ");
            Scanner sc = new Scanner(System.in);
            int bribeSum = sc.nextInt();

            if (bribeSum > 5000) {
                System.out.println("He will be arrested! ");
            } else
                d.bribeSum = bribeSum;
        }
    }

}
