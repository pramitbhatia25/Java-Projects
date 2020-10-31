/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceQuestions;

/**
 *
 * @author KIIT
 */
public class BetterPattern {
    
    public static void main(String[] Args)
    {
        int n = 6;
        for(int i =1; i<=n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print( "  ");
            }
            System.out.println("");
            
        }
    }
            
    
}
