package practice;

import java.util.Scanner;

public class Master {
    private static Scanner scanner = new Scanner(System.in);
    private static addUp master = new addUp("Let's roll");

    public static void main(String [] args){
        int choice;
        boolean quit = false;
        printOptions();
        while(!quit){
            System.out.println("\nEnter your choice. Press 1 to print options: ");
            choice = scanner.nextInt();
            if((choice < 0 && choice >7)){
                System.out.println("Enter different number.");
                System.out.println("\nEnter your choice. Press 1 to print options: ");
                break;

            }
            scanner.nextLine();


            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    printOptions();
                    break;
                case 2:
                    addOptions();
                    break;
                case 3:
                    updateOptions();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    printContacts();
                    break;
             }
        }
    }

    private static void printOptions(){
        System.out.println("\nPress\n"
                            +"0: To get out\n"
                            +"1: To print options\n"
                            +"2: To add options\n"
                            +"3: To update options\n"
                            +"4: To remove information\n"
                            +"5: To search a contact\n"
                            +"6: To print a list of contacts");
    }
    private static void addOptions(){
        System.out.println("Enter your first name: ");
        String first = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String last = scanner.nextLine();
        System.out.println("Enter your street: ");
        String street = scanner.nextLine();
        System.out.println("Enter your City: ");
        String city = scanner.nextLine();
        System.out.println("Enter your state: ");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code: ");
        String zip = scanner.nextLine();
        System.out.println("Enter your phone number: (xxx)-xxx-xxxx ");
        String phone = scanner.nextLine();
        Information information = Information.info(first, last, street, city, state, zip, phone);
        master.addIt(information);
    }

    private static void updateOptions() {
        System.out.println("Enter the reference name you want to update: ");
        String first = scanner.nextLine();
        System.out.println("Enter the new reference name: ");
        String nFirst = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String last = scanner.nextLine();
        System.out.println("Enter your street: ");
        String street = scanner.nextLine();
        System.out.println("Enter your City: ");
        String city = scanner.nextLine();
        System.out.println("Enter your state: ");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code: ");
        String zip = scanner.nextLine();
        System.out.println("Enter your phone number: (xxx)-xxx-xxxx ");
        String phone = scanner.nextLine();

        Information updated = Information.info(nFirst, last, street, city, state, zip, phone);

        Information old = master.queryInfo(first);

        if (first == null){
            System.out.println("Name does not exist");
        }
        else{
            master.updateIt(old, updated);
            System.out.println("Contact successfully updated");
        }
    }

    private static void removeContacts() {
        System.out.println("Enter the first name: ");
        String first = scanner.nextLine();
        System.out.println("Enter the last name: ");
        String last = scanner.nextLine();
        Information info = master.queryInfo(first);
        Information lastName = master.queryInfo(last);

        if(info == null){
            System.out.println("Contact does not exist");
        }
        else {

        }
    }

    private static void searchContacts() {
        System.out.println("Enter the first name: ");
        String first = scanner.nextLine();
        Information info = master.queryInfo(first);
        if( info == null){
            System.out.println("Name not found");
            return;
        }
        else{
            System.out.println(info.getName()+" found.");
        }
    }


    private static void printContacts(){
        master.printInfo();
    }


}
