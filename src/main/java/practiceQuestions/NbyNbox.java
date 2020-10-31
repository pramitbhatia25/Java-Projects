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
public class NbyNbox {
    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i =1; i<= m; i++)
        {
            for(int j = 1; j<= m; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
