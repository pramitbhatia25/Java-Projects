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
public class ArrayCandles {
    public static void main(String[] Args)
    {
        int N = 3;
        int candle[] = {1, 1, 2};
        int days = 0;
        int a[] = new int[N];
        while(candle != a)
        {
            for(int i = 0; i< N; i++)
                {
                    if(candle[i] != 0)
                    {
                        candle[i] -= 1;
                    }
                   
                }
            days += 1;
        }   
    System.out.println(" d " + days);
    
    }
}
