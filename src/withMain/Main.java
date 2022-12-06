package withMain;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        //task number 1
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 0, or 1");
        byte clientOs = num.nextByte();
        switch (clientOs){
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
}