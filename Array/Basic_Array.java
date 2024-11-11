package Array;

public class Basic_Array {
    public static void main(String[] args) {
        int[] arr;
        arr=new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println("Here are the element of an arry");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
