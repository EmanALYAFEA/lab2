import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        int arr[]=new int[]{12,13,14,15};
        reverse(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int a[] , int size)
    {
int[] copyArray=new int[size];

        for (int i = 0; i < a.length;i++) {
           copyArray[i]=a[a.length-1-i];

}
a=copyArray;
        System.out.println(Arrays.toString(a));}

}