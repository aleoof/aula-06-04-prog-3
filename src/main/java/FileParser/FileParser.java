package FileParser;

import Entities.Students;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

    private static String fileName =  "alunos.txt";

    public ArrayList<Students> readFile() throws IOException {



    ArrayList<Students> students = new ArrayList<Students>();
    try{
        FileReader fileReader = new FileReader(fileName);
        try(BufferedReader reader = new BufferedReader(fileReader)){
            String aux = "";


            while ((aux = reader.readLine()) != null){
                String[] line = aux.split(",");
                Students student = new Students();
                student.setName(line[0]);
                student.setGrade1(Double.parseDouble(line[1]));
                student.setGrade2(Double.parseDouble(line[2]));
                student.setGender(line[3].charAt(0));
            }
        }
    } catch(FileNotFoundException e) {
        e.printStackTrace();
    }

    return students;
    }
}
