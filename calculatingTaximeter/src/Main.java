import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double perKm = 2.20, minCost = 20, startingCost = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many km did you served: ");
        int kmGone = scanner.nextInt();

        double totalCost = startingCost + (kmGone * perKm);
        totalCost = (kmGone < 5) ? 20 : totalCost;


        System.out.println("Total cost:  " + totalCost);


    }
}
