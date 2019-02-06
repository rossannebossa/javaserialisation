package Serialisation;

import java.io.*;

public class Serialisation {

    public static void main(String[] args) {
        Employee e = new Employee(1, "Alana");

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Rossanne S. Bossa\\Documents\\Files\\output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
