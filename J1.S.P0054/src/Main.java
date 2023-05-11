
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
public class Main {
    public static void main(String[] args) {
        int select;
        Display display = new Display();
        GetData getData = new GetData();
        ContactManagement manager = new ContactManagement();
        ArrayList<Contact> contactList = new ArrayList<>();
        while (true) {            
            display.displayMenu();
            
            select = getData.getSelect("You select: ", 1,4);
            
            switch(select) {
                case 1:
                    manager.addContact(contactList);
                    break;
                case 2:
                    display.displayContactList(contactList);
                    break;
                case 3:
                    manager.deleteContact(contactList);
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
            }
        }
    }
    
}
