
package Tugas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
        

    public static void main(String[] args){
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
           Waktu objek = new Waktu();
            String waktu1;
            String waktu2;
        System.out.println("-- PROGRAM MENGHITUNG WAKTU");    
        System.out.print("-- MASUKAN WAKTU 1 : ");
        try {
            waktu1 = br.readLine();
        }
        catch (IOException e){
            System.out.println("-- mengecek");
            return;
        }
        System.out.print("-- MASUKAN WAKTU 2 : ");
        try {
            waktu2 = br.readLine();
        }
        catch (IOException e){
            System.out.println("-- mengecek");
            return;
        }
        int i;
        int o;
        
        int[] array=objek.toIntegerArray(waktu1);
        int[] array1 = objek.toIntegerArray(waktu2);
        for(i=0;i<array.length;i++){
            
        }
        
         for(o=0;o<array1.length;o++){

        }
         int jam = array[0] + array1[0];
         int menit = array[1] + array1[1];
         int detik = array[2] + array1[2];
         
        if(menit >= 60 && detik >= 60 )
        {
            jam++;
            menit++;
            System.out.println("-- JUMLAH = " + jam + " JAM , " +menit + " MENIT , " + detik + " DETIK.");
        }else if(menit >= 60){
            jam++;
            System.out.println("-- JUMLAH = " + jam + " JAM , " +menit + " MENIT , " + detik + " DETIK.");
        }
        else if(detik >= 60){
            menit++;
             System.out.println("-- JUMLAH = " + jam + " JAM , " +menit + " MENIT , " + detik + " DETIK.");
        }else {
            System.out.println("-- JUMLAH = " + jam + " JAM , " +menit + " MENIT , " + detik + " DETIK.");
        }
        
 
      
   
        
    }
    
}
