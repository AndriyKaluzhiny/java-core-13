package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("Введіть 1 щоб додати фракцію");
        System.out.println("Введіть 2 щоб видалити конкретну фракцію");
        System.out.println("Введіть 3 щоб вивести усі  фракції");
        System.out.println("Введіть 4 щоб очистити конкретну фракцію");
        System.out.println("Введіть 5 щоб вивести конкретну фракцію");
        System.out.println("Введіть 6 щоб додати депутата в фракцію");
        System.out.println("Введіть 7 щоб видалити депутата з фракції");
        System.out.println("Введіть 8 щоб вивести список хабарників");
    }


    public static void main(String[] args) throws alreadyExists, WrongInputException {
        List<Fraction> f = new ArrayList<Fraction>();
        List<Deputy> d = new ArrayList<Deputy>();
        verkhovnaRada v = new verkhovnaRada();
        Fraction fraction = new Fraction("");

        while (true) {
            menu();
            System.out.println(" ");
            System.out.println("Enter number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            switch (num) {
                case 0:
                    System.exit(1);

                case 1: {
                    v.addFraction(f);
                    break;
                }

                case 2: {
                    v.removeFraction(f);
                    break;
                }

                case 3: {
                    v.showAll(f);
                    break;
                }

                case 4: {
                    fraction.removeAll(d);
                    break;
                }

                case 5: {
                    fraction.showByName(f);
                    break;
                }

                case 6: {
                    v.AddDeputyToFraction(d, f);
                    break;
                }

                case 7: {
                    v.removeDeputy(d);
                    break;
                }

                case 8: {
                    v.showAllBribeTakers(d,f);
                    break;
                }

                case 9: {
                    v.addDeputy(d);
                }
            }
        }

    }
}
