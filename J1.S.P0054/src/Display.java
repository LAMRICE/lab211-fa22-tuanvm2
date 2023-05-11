
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class Display {

    void displayMenu() {
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
    }

    void displayContactList(ArrayList<Contact> contactList) {
        if(contactList.isEmpty()) {
            System.out.println("Doesn't exist contact");
        }else {
            System.out.println("--------------------- Display all Contact -------------------------");
            System.out.format("%-5s%-15s%-12s%-12s%-12s%-15s%-12s\n", "ID", "Name",
                                    "First Name","Last Name", "Group", "Address"
                                                    ,"Phone");
            for (Contact c : contactList) {
                c.display();
                
            }
        }
        
    }
    
}
