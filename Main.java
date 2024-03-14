import Model.Clients.*;
import java.util.Scanner;

/**
 * Identification comments:
 *   Name: soham patil
 *   System: Health Monitoring System
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 * ....
 * Beginning comments:
 * Filename: Main.java
 * @author:  soham patil
 * Overview: This is the main class used to create objects for Client Class, Records class; Menu Driven Program. In this file we have achieved the following
 * - Object Creation
 * - Calling Setters and Getters
 * - Creating Object Arrays
 * - Looping through Object Array
 * - Displaying contents of object array
 *
 */

public class Main {
    public static void main(String[] args)
    {
        int n;

        //Creating a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        //Creating a single Object
        Client c1 = new Client();

        // Using setters to set the values


        //Display client data
        c1.display();

        //Creating client object array
        Client clientArr[] = new Client[3];

        //Using For Loop to Take user input for each client object
        do{
            System.out.println("1 - Add client");
            System.out.println("2 - Edit client");
            System.out.println("3 - Delete client");
            System.out.println("4 - Display clients");
            System.out.println("5 - Enter record");
            System.out.println("6 - Exit");
            System.out.print("Enter Choice of Operation: ");

            int ch;
            ch = sc.nextInt();

            if (ch == 1) {
                for (int i = 0; i < clientArr.length; i++) {
                    sc.nextLine();

                    System.out.println("Enter no. of clients to be entered:");
                     
                     //Creating a Scanner Object to take input
                     Scanner sc1 = new Scanner(System.in);
                     n = sc1.nextInt();

                     for (i=1; i<=n; i++)
                     {

                    System.out.println("Enter Client Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Client Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Client Email: ");
                    String email = sc.nextLine();

                    System.out.println("Enter Client Gender: ");
                    String gender = sc.nextLine();

                    clientArr[i] = new Client(email, name, age, gender);
                     }
            }
            } else if (ch == 2) {
                // Displaying existing clients for selection
                System.out.println("Existing Clients:");
                for (int i = 0; i < clientArr.length; i++) {
                    System.out.println((i + 1) + ". " + clientArr[i].getf_name());
                }

                // Prompting user to select a client to edit
                System.out.println("Enter the client number you want to edit:");
                int userChoice = sc.nextInt();
                sc.nextLine();

                if (userChoice > 0 && userChoice <= clientArr.length) {
                    int index = userChoice - 1;
                    Client selectedClient = clientArr[index];

                    System.out.println("Selected Client Information:");
                    selectedClient.display();

                    System.out.println("Enter new information for the selected client:");
                    System.out.print("Enter Client Name: ");
                    String name = sc.nextLine();
                    selectedClient.setf_name(name);

                    System.out.print("Enter Client Age: ");
                    int age = sc.nextInt();
                    selectedClient.setf_age(age);
                    sc.nextLine();

                    System.out.print("Enter Client Email: ");
                    String email = sc.nextLine();
                    selectedClient.setClient_email(email);

                    System.out.print("Enter Client Gender: ");
                    String gender = sc.nextLine();
                    selectedClient.setf_gender(gender);

                    System.out.println("Updated Client Information:");
                    selectedClient.display();
                } else {
                    System.out.println("Invalid client number.");
                }
            } else if (ch == 3) {
                for (int i = 0; i < clientArr.length; i++) {
                    System.out.print("Enter Index of client to delete : ");
                    int user = sc.nextInt();
                    sc.nextLine();
                    clientArr[user].setf_name(null);
                    clientArr[user].setf_age(0);
                    clientArr[user].setClient_email(null);
                    clientArr[user].setf_gender(null);
                }
            } else if (ch == 4) {
                for (int i = 1; i < clientArr.length; i++) {
                    System.out.print("");
                    clientArr[i].display();
                }
            }
                else if (ch == 5){
                    // Displaying existing clients for selection
                System.out.println("Existing Clients:");
                for (int i = 0; i < clientArr.length; i++) {
                    System.out.println((i + 1) + ". " + clientArr[i].getf_name());
                }

                // Prompting user to select a client to enter records
                System.out.println("Enter the client number to enter records:");
                int userChoice = sc.nextInt();
                sc.nextLine();
   

                
                }
             else if (ch == 6) {
                return;
            } else {
                System.out.println("Invalid input.");
            }
        } while (true);
}
}