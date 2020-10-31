/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksFGQuestions;

/**
 *
 * @author KIIT
 */
public class MaxArea {

    public static void main(String[] Args){
        
        int arr[] = {1,2, 3, 4, 5, 6, 7, 8};
        int max1 = arr[0];
        int max2 = arr[1];
        
        for(int i =2; i< arr.length - 1; i+= 2)
        {
            if(arr[i] > max1) max1 = arr[i];
                       
        }
        for(int i =3; i< arr.length; i+= 2)
        {
            if(arr[i] > max2) max2 = arr[i];
                       
        }
 
        System.out.println(" " + max1 + "  2 is " + max2);
        
        
        
        
        
        
        
        
        
    }


    
}
