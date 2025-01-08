//Write a JAVA program to find the maximum and minimum elements in an array. 

package Lab_2;
public class Q2 {
    //max min using recursion
    public static int max(int[] a,int n){
        int max;
        if(n==0)
            return a[n];
        else{
            max=Math.max(a[n],max(a,n-1));
        }
        return max;
    }
    public static int min(int[] a,int n){
        int max;
        if(n==0)
            return a[n];
        else{
            max=Math.min(a[n],min(a,n-1));
        }
        return max;
    }

    public static void main(String[] args) {
        int []a={1,2,3,-1,2,3};
        System.out.println(max(a,a.length-1));
        System.out.println(min(a,a.length-1));

    }

}