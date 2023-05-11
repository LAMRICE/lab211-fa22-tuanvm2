
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
class ContactManagement {

    GetData getData = new GetData();

    void addContact(ArrayList<Contact> contactList) {
        int ID;
        if (contactList.isEmpty()) {
            ID = 1;
        } else {
            ID = contactList.get(contactList.size() - 1).getID() + 1;
        }
        String name = getData.getString("Enter Name: ", "Invalid", "^[A-Za-z ]+$");
        String[] str = name.split("\\s+");
        String firstName = "";
        String lastName = "";
        for (int i = 0; i < str.length - 1; i++) {
            firstName += str[i] + " ";
        }
        lastName = str[str.length - 1];
        String group = getData.getString("Enter Group: ", "Invalid", "^[A-Za-z ]+$");
        String address = getData.getString("Enter Address: ", "Invalid", "^[A-Za-z ]+$");
        String phone = getData.getPhone("Enter Phone: ");
        contactList.add(new Contact(ID, name, group, address, phone, lastName, firstName));
        System.out.println("Add success");
    }

    boolean checkIDExist(ArrayList<Contact> contactList, int ID) {
        boolean isExist = false;
        for (Contact c : contactList) {
            if (ID == c.getID()) {
                isExist = true;
                return isExist;
            }
        }
        return isExist;
    }

    void deleteContact(ArrayList<Contact> contactList) {
        if (contactList.isEmpty()) {
            System.out.println("Doesn't exist contact");
        }
        while (true) {
            int ID = getData.getID("Enter ID: ");
            if (checkIDExist(contactList, ID) == false) {
                System.out.println("Not found contact");
            } else {
                for (Contact c : contactList) {
                    if (ID == c.getID()) {
                        contactList.remove(c);
                        System.out.println("Deleted success");
                        return;
                    }
                }
            }
        }

    }

}
