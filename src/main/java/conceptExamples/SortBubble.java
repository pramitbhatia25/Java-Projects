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
public class SortBubble {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements to sort: ");
        int n = sc.nextInt();
        int[] givenArray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< n; i++)
        {
            givenArray[i] = sc.nextInt();
        }
        int iteration = 0;
        for(int j = 0; j<n-1; j++)
        {
        for(int i = 0; i<n-1; i++)
        {
            if (givenArray[i] > givenArray[i+1]) 
            {
                int c = givenArray[i];
                givenArray[i] = givenArray[i+1];
                givenArray[i+1] = c;
            }
        }iteration += 1;
        }
        for(int i = 0; i< n; i++)
        {
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();
        System.out.println(iteration);
        
        
    }
    
}
