package Serialisation;

import java.io.*;

public class Deserialisation {

    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Rossanne S. Bossa\\Documents\\Files\\output.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (Employee) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }       
        System.out.println("Deserialisated: "+e.toString());
    }
}
