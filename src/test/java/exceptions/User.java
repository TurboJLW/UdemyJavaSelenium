package exceptions;

import java.util.Scanner;

public class User extends Person {
    int age = 10;
    String name = "Grzesiu Maluch";
    Scanner scanner = new Scanner(System.in);

    User(){
        this.age = scanner.nextInt();
        this.name = scanner.next();
    }

    void AgeVerification() throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("This is an invalid age");
        } else if (age >= 0 && age < 18) {
            System.out.println("You are not an adult!");
        } else if (age >= 18) {
            System.out.println("You are an adult! Welcome!");
        }
    }
}
