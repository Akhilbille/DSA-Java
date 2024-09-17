import java.util.Arrays;

public class P8ResizeAnArray {

    public void resize(int[] arr){
        int capacity = arr.length * 2;
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length;i++){
            temp[i] = arr[i];
        }
        arr =temp;
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args){
        P8ResizeAnArray obj = new P8ResizeAnArray();
        obj.resize(new int[] {1,5,3,4});
    }
}
