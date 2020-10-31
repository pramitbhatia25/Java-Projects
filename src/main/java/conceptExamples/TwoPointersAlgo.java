/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptExamples;

import java.util.Arrays;

/**
 *
 * @author KIIT
 */
//Used to find 2 nos in array that sum up to 0, or sum up to any given no.
public class TwoPointersAlgo {
    public static void main(String[] Args)
    {
        int[] one = {7, -3, 3, -1, 1, -2, 2};
        //first we have to sort the array....Use function call
        Arrays.sort(one);
        //now start pointer i from one[0] and j from one[6]
        int i = 0;int j = 6;
        boolean yes = false;
        while(i<j)
        {
            if(one[i] + one[j] < 0)     //check if onei = onej is less than given no implies
            {
                i++;        // increase lhs
            }
            else if(one[i] + one[j] > 0)
            {
                j--;
            }
            else if(one[i] + one[j] == 0)
            {
                System.out.println("" + one[i] + " " + one[j] );
                yes = true;break;
                
            }
        }
        if(!yes) System.out.print(" not p");
        
        
        
    }
}
