import java.io.*;
import java.util.*;

class Account {
    static int acc_number = 1212;
    String acc_holder_name;
    int pin;
    double balance;
    String unique_id;
    int a_no;

    void createAcc() {
        a_no = acc_number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account holder name ");
        acc_holder_name = in.nextLine();
        System.out.println("\nEnter Username");
        unique_id = in.nextLine();
        int length_pin = 0;
        do{
            System.out.println("Enter secret 4 digit pin ");
            pin = in.nextInt();
            length_pin = String.valueOf(pin).length();
        }
        while (length_pin != 4);
        System.out.print("Enter intial deposit amount ");
        balance = in.nextDouble();
        System.out.println("Congratulations Account Successfully created!! \n");
        System.out.println("Account Details-\n " + "Account Number- " + a_no + "\nAccount Holder Name- " + acc_holder_name + "\nBalance - " + balance + "\nThank You ");
        // create a file with the account number
        
    }
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}