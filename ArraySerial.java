package Serialisation;

import java.io.*;
import java.util.*;

public class ArraySerial {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hot Chip");
        list.add("Haerts");
        list.add("Haim");
        
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Files\\output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
