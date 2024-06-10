import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your party affiliation, D - R - I: ");
        String userParty = in.nextLine();

        if (userParty.equals("D")) {
            System.out.println("You get a Democratic Donkey, because you entered: " + userParty);

        } else if (userParty.equals("R")) {
            System.out.println("You get a Republican Elephant, because you entered: " + userParty);

        } else if (userParty.equals("I")) {
            System.out.print("You get a Person for Independent, because you entered: " + userParty);

        } else
            System.out.println("Since your entered data, " + userParty + ", does not match D, R, or I, your party affiliation is other!");
    }
}