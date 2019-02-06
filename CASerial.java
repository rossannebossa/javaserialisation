package Serialisation;

import java.io.*;
import java.util.*;

public class CASerial {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Emily");
        Employee e2 = new Employee(2, "Noami");
        Employee e3 = new Employee(3, "Effy");
        Employee e4 = new Employee(4, "Freddy");
               
        ArrayList<Object> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Rossanne S. Bossa\\Documents\\Files\\output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }       
    }
}
