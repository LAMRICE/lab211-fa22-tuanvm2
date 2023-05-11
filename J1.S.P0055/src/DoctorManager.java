
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class DoctorManager {

    FileUtils fileUntils = new FileUtils();
    GetData getData = new GetData();

    void addDoctor(HashMap<String, Doctor> doctorMap) throws IOException {
        fileUntils.readToFile(doctorMap);
        System.out.println("--------- Add Doctor ---------");
        String code = "";
        //loop to until user input ID correct
        while (true) {
            code = getData.getCode("Enter Code: ");
            //Check if ID exist 
            if (checkCodeExist(doctorMap, code) != null) {
                System.out.println("Error, Duplicate ID!!");
                //Check if ID not exist    
            } else {
                break;
            }
        }
        String name = getData.getString("Enter Name: ");
        String specialization = getData.getString("Enter Specialization: ");
        int availability = getData.checkAvailability();
        Doctor newDoctor = new Doctor(code, name, specialization, availability);
        doctorMap.put(code, newDoctor);
        System.out.println("Add doctor successfully!");
        fileUntils.writeToFileAll(doctorMap);

    }

    Doctor checkCodeExist(HashMap<String, Doctor> doctorMap, String Code) {
        //loop to access to element in map from begin to last
        for (Map.Entry<String, Doctor> doctor : doctorMap.entrySet()) {
            //Check if code input equal code of doctor in map
            if (doctor.getKey().equals(Code)) {
                return doctor.getValue();
            }
        }
        return null;
    }

    void updateDoctor(HashMap<String, Doctor> doctorMap) throws IOException {
        //Check if doctor map is empty
        if (doctorMap.isEmpty()) {
            System.out.println("Data not exist");
            //Check if map is not empty    
        } else {
             System.out.println("--------- Update Doctor ---------");
            //loop to until users input correct ID want to update
            while (true) {
                String code = getData.getCode("Enter Code update: ");
                //Check if ID not exist
                if (checkCodeExist(doctorMap, code) == null) {
                    System.out.println("Doesn't exits ID");
                    //Check if ID  exist    
                } else {
                    Doctor doctor = checkCodeExist(doctorMap, code);
                    String codeUpdate = "";
                    String name = "";String nameOld = doctor.getName();
                    String specialization = "";
                    String specializationOld = doctor.getSpecialization();
                    int availability = 0;
                    doctorMap.remove(doctor.getCode());
                    //Check name or specialization of doctor update is blank
                    if (nameOld.isEmpty() || specializationOld.isEmpty()) {
                        while (true) {
                            codeUpdate = getData.getCode("Enter Code: ");
                            //Check if ID exist 
                            if (checkCodeExist(doctorMap, codeUpdate) != null) {
                                System.out.println("Error, Duplicate ID!!");
                                //Check if ID not exist    
                            } else {
                                break;
                            }
                        }
                        //If name of doctor update is blank
                        if (nameOld.isEmpty()) {
                            name = nameOld;
                            System.out.println("Name is blank not change");
                        } else {
                            name = getData.getString("Enter Name: ");
                        }
                        //If specialization of doctor update is blank
                        if (specializationOld.isEmpty()) {
                            specialization = specializationOld;
                            System.out.println("Specialization is blank not change");
                        } else {
                            specialization = getData.getString("Enter Specialization: ");
                        }
                        availability = getData.checkAvailability();
                        doctorMap.put(codeUpdate, new Doctor(codeUpdate, name, specialization, availability));
                        System.out.println("Update info doctor "
                                + "successfully!");
                        fileUntils.writeToFileAll(doctorMap);
                        return;
                    } else {
                        doctorMap.remove(doctor.getCode());
                        while (true) {
                            codeUpdate = getData.getCode("Enter Code: ");
                            //Check if ID exist 
                            if (checkCodeExist(doctorMap, codeUpdate) != null) {
                                System.out.println("Error, Duplicate ID!!");
                                //Check if ID not exist    
                            } else {
                                break;
                            }
                        }
                        name = getData.getString("Enter Name: ");
                        specialization = getData.getString("Enter Specialization: ");
                        availability = getData.checkAvailability();
                        doctorMap.put(codeUpdate, new Doctor(codeUpdate, name, 
                                                specialization, availability));
                        System.out.println("Update info doctor "
                                + "successfully!");
                        fileUntils.writeToFileAll(doctorMap);
                        return;

                    }

                }
            }
        }
    }

    void deleteDoctor(HashMap<String, Doctor> doctorMap) throws IOException {
        //Check if map is empty
        if (doctorMap.isEmpty()) {
            System.out.println("Data not exist");
            //Check if map is not empty    
        } else {
            System.out.println("--------- Delete Doctor ---------");
            //loop to until users input correct ID want to delete
            while (true) {
                String code = getData.getCode("Enter Code: ");
                //Check if ID not exist 
                if (checkCodeExist(doctorMap, code) == null) {
                    System.out.println("Doesn't exits ID");
                    //Check if ID exist 
                } else {
                    //loop to access to element in map from begin to last
                    for (Map.Entry<String, Doctor> doctor : doctorMap.entrySet()) {
                        //Check if input code is equal ID in map
                        if (doctor.getKey().equals(code)) {
                            doctorMap.remove(code);
                            System.out.println("Delete info doctor successfully!");
                            fileUntils.writeToFileAll(doctorMap);
                            return;
                        }
                    }
                }
            }
        }
    }

    void searchDoctor(HashMap<String, Doctor> doctorMap)  {
        
        //Check if map is empty
        if (doctorMap.isEmpty()) {
            System.out.println("Data not exist");
            //Check if map is not empty
        } else {
            System.out.println("--------- Search Doctor ---------");
            boolean flag = false;
            String text = getData.getText();
            System.out.println("--------- Result ---------");
            //loop to access to element in map from begin to last
            for (Map.Entry<String, Doctor> doctor : doctorMap.entrySet()) {
                /*Check if input text  containt name in map or input text
                containt specialization */
                if (doctor.getValue().getName().toLowerCase().contains(text.toLowerCase())
                        || doctor.getValue().getSpecialization().toLowerCase().
                                contains(text.toLowerCase())) {
                    //Check if flag is equal false
                    if (flag == false) {
                        System.out.format("%-12s%-20s%-30s%-20s\n", "Code",
                                "Name", "Specialization", "Availability");
                    }
                    System.out.println(doctor.getValue().toString());
                    flag = true;
                }
            }
            //Check if flag is equal false
            if (flag == false) {
                System.out.println("Not found info doctor!");
            }
        }
    }
}
