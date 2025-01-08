/*Given an unsorted array of n elements , 
write a java program to find the first element which is repeated*/

package Lab_6;

import java.util.*;
public class Q1
{
    public static void main(String[] args) {
        
        int [] s={1,2,3,4,4};
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    System.out.println("first repeated character is= "+s[i]);
                return;
                }
            }
        }
        System.out.println("not found");


    }
}