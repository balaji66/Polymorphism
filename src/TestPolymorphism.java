import java.util.Scanner;

public class TestPolymorphism {

    private static String bankName;

    public static void main(String args[]){

            inputReader();
    }

    private static void inputReader()
    {
        System.out.println("Enter Bank Name :");
        Scanner scanner =new Scanner(System.in);
        bankName = scanner.nextLine();
        checkBankName();
    }
    private static void checkBankName()
    {
        switch (bankName) {
            case "SBI":
                Bank b = new SBI();
                System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
                inputReader();
                break;
            case "ICICI":
                b = new ICICI();
                System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
                inputReader();
                break;
            case "PNB":
                b = new PNB();
                System.out.println("PNB Rate of Interest: " + b.getRateOfInterest());
                inputReader();
                break;
            case "0":
                System.out.close();
                break;
            default:
                System.out.println("InCorrect BankName");
                inputReader();
                break;
        }
    }
}
