
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
public class FileUtils {
    
    void readToFile(HashMap<String, Doctor> doctorMap) throws 
                                            FileNotFoundException, IOException {
        File f = new File("src\\doctor.txt");
        if(!f.exists()) {
            f.createNewFile();
        }
        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        //loop to read data from file when read all data in flie
        while (true) {
            line = br.readLine();
            //Check if read line equal null
            if (line == null) {
                break;
            }
            String txt[] = line.split("; ");
            String code = txt[0].trim();
            String name = txt[1].trim();
            String specialization = txt[2].trim();
            int availability = Integer.parseInt(txt[3].trim());
            doctorMap.put(code, new Doctor(code,name, specialization, 
                                                                availability));
        }
        br.close();
        fr.close();
    }


    void writeToFileAll(HashMap<String, Doctor> doctorMap) throws IOException {
        FileWriter fw = new FileWriter("src\\doctor.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        String line = "";
        //loop to use access doctor element in map from begin to the last
        for (Map.Entry<String, Doctor> doctor : doctorMap.entrySet()) {
            line = doctor.getValue().getCode() + "; "
                    + doctor.getValue().getName() + "; "
                    + doctor.getValue().getSpecialization() + "; "
                    + doctor.getValue().getAvailability();
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        fw.close();
    }

    

}

