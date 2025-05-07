import java.util.Scanner;

class EVM {

    public static int bjp, mnc, ss, nota, ncp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the population of your district");
        int pop = sc.nextInt();

        for (int i = 0; i < pop; i++) {
            System.out.println("Choose the party :");
            System.out.println("1. BJP");
            System.out.println("2. MNC");
            System.out.println("3. SS");
            System.out.println("4. NCP");
            System.out.println("5. NOTA");

            String party = sc.next().toUpperCase();

            switch (party) {
                case "BJP":
                    bjp++;
                    break;
                case "MNC":
                    mnc++;
                    break;
                case "SS":
                    ss++;
                    break;
                case "NCP":
                    ncp++;
                    break;
                case "NOTA":
                    nota++;
                    break;
                default:
                    System.out.println("Invalid party name you chose. Please choose the correct party name.");
            }
        }

         
        if (bjp >= mnc && bjp >= ss && bjp >= ncp && bjp >= nota) {
            System.out.println("BJP win the election ");
        } else if (mnc >= bjp && mnc >= ss && mnc >= ncp && mnc >= nota) {
            System.out.println("MNC win the election ");
        } else if (ss >= bjp && ss >= mnc && ss >= ncp && ss >= nota) {
            System.out.println("SS win the election");
        } else if (ncp >= bjp && ncp >= ss && ncp >= mnc && ncp >= nota) {
            System.out.println("NCP win the election ");
        } else {
            System.out.println("NOTA win the election ");
        }

       
    }
}
