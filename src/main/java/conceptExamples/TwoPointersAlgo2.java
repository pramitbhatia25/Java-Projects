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
//Used to find 3 nos in array that sum up to 0, or sum up to any given no.
public class TwoPointersAlgo2 {
    public static void main(String[] Args)
    {
        int[] one = {1, 4, 45, 6, 10, 8};
        if(ThreeS(one) == true)
        {
            System.out.println("Possible Triplet");
        }else{System.out.println("NO");}
    }
    
    public static boolean ThreeS(int[] one)
    {
        Arrays.sort(one);
        for(int i = 0; i < one.length-2; i ++)
        {
            if(TwoSum(one, -one[i], i+1)) return true;
        }
        return false;
    
    }
    public static boolean TwoSum(int[] one, int x, int i)
    {
        Arrays.sort(one);
        int j = one.length - 1;
        boolean yes = false;
        while(i<j)
        {
            if(one[i] + one[j] < x)     //check if onei = onej is less than given no implies
            {
                i++;        // increase lhs
            }
            else if(one[i] + one[j] > x)
            {
                j--;
            }
            else if(one[i] + one[j] == x)
            {
             return true;   
            }
        }
        return false;
    }    
    
}
