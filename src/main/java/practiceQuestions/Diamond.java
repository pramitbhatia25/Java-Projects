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
public class Diamond {
    public static void main(String[] Args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 1; j<= n; j++)
        {
            for(int i = 1; i<= n - j;i++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*j -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j = n-1; j>= 1; j--)
        {
            for(int i = 1; i<= n - j;i++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*j -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
