package ua.lviv.lgs;

public class alreadyExists extends Throwable {
    alreadyExists() {
        System.err.println("This deputy already exists");
    }
}
