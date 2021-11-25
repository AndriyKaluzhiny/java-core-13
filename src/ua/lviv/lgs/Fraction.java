package ua.lviv.lgs;

import java.util.*;

public class Fraction extends verkhovnaRada{

    String name;

    Fraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRandomValue(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    public boolean getRandomValueBoolean() {
        Random r = new Random();
        return r.nextBoolean();
    }

    public List<Deputy> removeDeputy(List<Deputy> d) {
        System.out.println("Enter Deputy name(He will be removed): ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Iterator<Deputy> deputyIterator = d.iterator();

        Deputy deputy = deputyIterator.next();

        while (deputyIterator.hasNext()) {
            if (deputy.getName() == name) {
                deputyIterator.remove();
            }
        }
        return d;
    }

    public void allBribeTakersShow(List<Deputy> d) {
        Iterator<Deputy> deputyIterator = d.iterator();

        Deputy deputy = deputyIterator.next();

        while (deputyIterator.hasNext()) {
            if (deputy.isBribeTaker()) {
                System.out.println(deputy);
            }
        }
    }

    public void showAllDeputies(List<Deputy> d, List<Fraction> f,  String fractionName) {
        Iterator<Fraction> fractionIterator = f.iterator();
        Fraction fraction = fractionIterator.next();

        Iterator<Deputy> deputyIterator = d.iterator();
        Deputy deputy = deputyIterator.next();

        System.out.println("Enter fraction name: ");

        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        while (fractionIterator.hasNext()) {
            if (fraction.name == fName) {
                for (int i = 0; i < d.size(); i++) {
                    if (deputy.getFraction() == fName) {
                        System.out.println(deputy);
                    }
                }
            }
        }
    }

    public List<Deputy> removeAll(List<Deputy> d) {
        Iterator<Deputy> deputyIterator = d.iterator();

        Deputy deputy = deputyIterator.next();

        System.out.println("Enter fraction name(All members will be removed): ");
        Scanner sc = new Scanner(System.in);
        String fractionName = sc.next();

        while (deputyIterator.hasNext()) {
            Deputy deputy1 = deputyIterator.next();

            if (deputy1.getFraction().equals(fractionName)) {
                deputyIterator.remove();
            }
        }
        return d;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                '}';
    }
}
