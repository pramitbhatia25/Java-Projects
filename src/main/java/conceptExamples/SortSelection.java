/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptExamples;
import java.util.Scanner;
/**
 *
 * @author KIIT
 */
public class SortSelection {
    public static void main(String[] Argrs){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements to sort: ");
        int n = sc.nextInt();
        int[] givenArray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< n; i++)
        {
            givenArray[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int minIndex = i;
            for(int j = i; j<n; j++)
            {
                if(givenArray[j]< givenArray[i])
                {
                    minIndex = j;
                }
            }
            int temp = givenArray[i];
            givenArray[i] = givenArray[minIndex];
            givenArray[minIndex] = temp;
        }
        for(int i = 0; i< n; i++)
        {
            System.out.print(" " + givenArray[i]);
        }
        
    }
    
}

