package withMain;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        System.out.println("\n");
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
    public static void task3(){
        // task 3
        System.out.println("\n");
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year");
        int leapYearOrNot = year.nextInt();
        boolean notLeap100 = leapYearOrNot % 100 == 0;
        boolean leap4 = leapYearOrNot % 4 == 0;
        boolean leap400 = leapYearOrNot % 400 == 0;
        if(leap4){
            if(notLeap100){System.out.println("The year is not leap!");}
            else{System.out.println("The year is leap!");}
        }else if (leap400){
            System.out.println("The year is leap!");
        }else{
            System.out.println("The year is not leap");
        }
    } // done
    public static void task4(){
        //task 4
        System.out.println("\n");
        Scanner dist = new Scanner(System.in);
        System.out.println("Enter the distance from the bank, to your home!");
        int deliveryDistance = dist.nextInt();
        if(deliveryDistance >= 100) {
            System.out.println("The distance is so far away from the bank!");
        }else if(deliveryDistance < 20){
            System.out.println("The deliver will take one day!");
        }else if(deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("The deliver will take two days");
        }else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("The deliver will take three days");
        }
    }
    public static void task5(){
        //task 5
        System.out.println("\n");
        Scanner dist = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int monthNumber = dist.nextInt();
        if(monthNumber >=1 && monthNumber <= 2 || monthNumber == 12){System.out.println("It must be snowy outside, it's winter!");}
        else if(monthNumber >= 3 && monthNumber <= 5){System.out.println("It's Spring outside!");}
        else if(monthNumber >= 6 && monthNumber <= 8){System.out.println("Summer!!!!");}
        else if(monthNumber >= 9 && monthNumber <=11){System.out.println("It's autumn!");}
    }
}