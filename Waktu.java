
package Tugas2;

import java.util.Scanner;


public class Waktu {
   
   
     
     public int[] toIntegerArray(String str){

       
        String[] splitArray = str.split(" ");

        int[] array = new int[splitArray.length];

        for(int i=0;i<splitArray.length;i++)

        {

                try {

                    array[i] = Integer.parseInt(splitArray[i]);

                } catch (NumberFormatException e) {

                    array[i]=-1;

                }

        }

        return array;

    }
     
  
}
