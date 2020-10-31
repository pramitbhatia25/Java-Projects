/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceQuestions;

import java.util.Scanner;

/**
 *
 * @author KIIT
 */
public class Arrays {
    
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] firstArray = new int[n];
        for(int i = 0; i< n; i++)
        {
            firstArray[i] = sc.nextInt();
        }
        System.out.print("The elements are: \n");
        for(int j = 0; j< n; j++)
        {
            System.out.println(firstArray[j]);
            
        }
        
    }
    
}
