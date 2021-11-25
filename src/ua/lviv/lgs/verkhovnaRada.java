package ua.lviv.lgs;

import java.util.*;

public class verkhovnaRada implements Randomable {

    public List<Fraction> addFraction(List<Fraction> fractionList) {
        System.out.println("Enter fraction name: ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        Fraction f = new Fraction(fName);

        fractionList.add(f);
        return fractionList;
    }

    public List<Fraction> removeFraction(List<Fraction> fractionList) {
        System.out.println("Enter fraction name(it will be removed): ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        fractionList.removeIf(f -> f.getName().equals(fName));
        return fractionList;
    }

    public void showAll(List<Fraction> f) {
        System.out.println(f.toString());
    }

    public void showByName(List<Fraction> f) {
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        for (int i = 0; i < f.size(); i++) {
            if (f.toString().contains(fName)) {
                System.out.println(f);
                break;
            }
        }
    }

    public List<Deputy> AddDeputyToFraction(List<Deputy> deputyList, List<Fraction> f) throws alreadyExists, WrongInputException {
        System.out.println("Enter deputy name(He will be added to fraction): ");
        Scanner sc = new Scanner(System.in);
        String dName = sc.next();

        System.out.println("Enter deputy surname: ");
        Scanner sc2 = new Scanner(System.in);
        String dSurname = sc2.next();

        System.out.println("Choose your fraction: ");

        System.out.println(f);



        Scanner sc4 = new Scanner(System.in);
        String inputFraction = sc2.next();
//        Deputy d = new Deputy(getRandomValue(140, 210), getRandomValue(50, 100), dName, dSurname, inputFraction ,dAge , false );

        Iterator<Deputy> deputyIterator = deputyList.iterator();

        while (deputyIterator.hasNext()) {
            Deputy dNext = deputyIterator.next();
            if (dNext.getName().equals(dName) && dNext.getSurname().equals(dSurname)) {
                dNext.fraction = inputFraction;
            }
        }
        return deputyList;

    }

    public List<Deputy> removeDeputy(List<Deputy> d) throws WrongInputException {
        System.out.println("Enter deputy name(He will be removed): ");
        Scanner sc = new Scanner(System.in);
        String dName = sc.next();

        System.out.println("Enter deputy surname: ");
        Scanner sc2 = new Scanner(System.in);
        String dSurname = sc.next();

        d.removeIf(next -> next.getName().equals(dName) && next.getSurname().equals(dSurname));
        return d;
    }

    public List<Deputy> addDeputy(List<Deputy> d) {
        Scanner scanner = new Scanner(System.in);
        String dName = scanner.next();

        Scanner sc2 = new Scanner(System.in);
        String dSurname = sc2.next();

        Scanner sc3 = new Scanner(System.in);
        int dAge = sc3.nextInt();

        Deputy newDeputy = new Deputy(getRandomValue(140, 200), getRandomValue(50, 100), dName, dSurname, null, dAge, getRandomValueBoolean(), 0);

        newDeputy.giveBribe(newDeputy);

        d.add(newDeputy);

        return d;
    }

    public void showAllBribeTakers(List<Deputy> d, List<Fraction> f) {
        Iterator<Deputy> deputyIterator = d.iterator();
        Iterator<Fraction> fractionIterator = f.iterator();

        System.out.println(f);

        System.out.println("Enter fraction name: ");
        Scanner sc1 = new Scanner(System.in);
        String fName = sc1.next();
        while (deputyIterator.hasNext()) {
            Deputy deputy = deputyIterator.next();
            if (deputy.getFraction().equals(fName)) {
                System.out.println(deputy);
            }
        }
    }

    public void showAllDeputiesOfFraction(List<Deputy> deputyList) {
        Iterator<Deputy> deputyIterator = deputyList.iterator();

        Scanner scanner = new Scanner(System.in);
        String fName =  scanner.next();

        while (deputyIterator.hasNext()) {
            Deputy d = deputyIterator.next();
            if (d.getFraction().equals(fName)) {
                System.out.println(d);
            }
        }
    }

    private boolean getRandomValueBoolean() {
        Random r = new Random();
        return r.nextBoolean();
    }

    @Override
    public int getRandomValue(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
