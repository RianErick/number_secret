
import util.UtilClass;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberSecret;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum size of the secret number.");

        int nQuantity = sc.nextInt();

        if (nQuantity < 0)
            throw new RuntimeException("The size cannot be less than zero!");
        else {
            numberSecret = new Random().nextInt(nQuantity);
        }

        System.out.println("Choose how many quantities you want:");

        UtilClass.row();

        int level = sc.nextInt();

        int kick [];

        switch (level) {

            case 1:
                 kick = new int[10];
                break;

            case 2:
                 kick = new int[5];
                break;

            case 3:
                 kick  = new int[3];
                break;

            default:
                kick = new int[1];
                System.out.println("option does not exist you only have one try!");
        }

        for (int i = 0; i < kick.length; i++) {

            System.out.println("Attempt : " + (i + 1) + " in " + (kick.length));
            System.out.println("What your kick?");
            kick[i] = sc.nextInt();

            if (kick[i] == numberSecret) {
                System.out.println("Congrats won the match!!");
                break;
            } else if (kick[i] < numberSecret) {
                System.out.println("Kick < Number Secret ");

            } else if (kick[i] > numberSecret) {
                System.out.println("Kick < Number Secret ");

            } else if (kick[i] < 0) {
                System.out.println("Kick < 0 ");
            }

        }
        System.out.println("Quantity for kicks :" + Arrays.stream(kick).count());

    }

}