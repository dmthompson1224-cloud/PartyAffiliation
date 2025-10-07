import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party;

        System.out.print("Are you a democrat, republican, or independent? enter D, R, or I: ");

        if (in.hasNext()) {
            party = in.nextLine();

            if (party.equals("D")) {
                System.out.println("You get a democratic donkey!");
            } else if (party.equals("R")) {
                System.out.println("You get a republican elephant!");
            } else if (party.equals("I")) {
                System.out.println("You get an independent man!");
            } else {
                System.out.println("please enter your affiliation as R, D, or I.");
                System.exit(0);
            }


        }

    }
}