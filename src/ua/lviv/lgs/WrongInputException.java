package ua.lviv.lgs;

public class WrongInputException extends Throwable {
    WrongInputException() {
        System.err.println("This fraction doesn't exists!");
    }
}
