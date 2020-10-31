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
public class SortBubbleOptimized {
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
        boolean sorted = true;                      //outer loop doesnt need to run as many times
        int iteration = 0;                          //sometimes sorting occurs before n-1 times
        for(int j = 0; j<n-1; j++)                  //this helps to reduce outer loop runs
        {
        for(int i = 0; i<n-1 - i; i++)              //inner loop only needs to run n - 1 - i 
        {                                           //as last element automatically reaches
            if (givenArray[i] > givenArray[i+1])    //end of the line so no need to check last one
            {
                int c = givenArray[i];
                givenArray[i] = givenArray[i+1];
                givenArray[i+1] = c;
                sorted = false;
            }
        }
        iteration += 1;
        if(sorted) break;
        }
        for(int i = 0; i< n; i++)
        {
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();
        System.out.println(iteration);
        
        
    }
    
}
