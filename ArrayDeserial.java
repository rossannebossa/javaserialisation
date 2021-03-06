package Serialisation;

import java.io.*;
import java.util.*;

public class ArrayDeserial {
    
    public static void main (String [] args){
        ArrayList<Object> list = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Files\\output.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        for(Object o : list){
            System.out.println(o);
        }
    }
}
