package withMain;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        //task number 1
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 0, or 1");
        byte clientOs = num.nextByte();
        switch (clientOs) {
            case 0:
                System.out.println("Download version for iOS from this link: ");
                break;
            case 1:
                System.out.println("Download version for Android from this link: ");
                break;
            default:
                System.out.println("Sorry, we haven't done a website for your OS yet!");
        }
    }

    public static void task2() {
        //task 2
        Scanner word = new Scanner(System.in);
        System.out.println("Enter number 0, or 1");
        int clientOs = word.nextInt();

        Scanner year = new Scanner(System.in);
        System.out.println("Please, enter the year of your phone!");
        int yearOfPhone = year.nextInt();
        boolean earlyVersion = yearOfPhone < 2015;
        boolean goodVersion = yearOfPhone >= 2015;

        if (goodVersion) {
            switch (clientOs) {
                case 0:
                    System.out.println("Download version for iOS from this link: ");
                    break;
                case 1:
                    System.out.println("Download version for Android from this link: ");
                    break;
                default:
                    System.out.println("Sorry, we haven't done a website for your OS yet!");
            }
        } else if (earlyVersion) {
            switch (clientOs) {
                case 0:
                    System.out.println("Download light version from this link: ");
                    break;
                case 1:
                    System.out.println("Download light version for Android from this link: ");
                    break;
                default:
                    System.out.println("Sorry, we haven't done a website for your OS yet!");
                    //push
            }
        }
    }
}