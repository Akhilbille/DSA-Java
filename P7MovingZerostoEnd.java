import java.util.Arrays;

public class P7MovingZerostoEnd {

    public void moveZerosToEnd(int[] arr){
        int length = arr.length;
        int j = 0;
        for(int i = 0;i < length; i++){
            if(arr[i] != 0 && arr[j]==0 ){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if(arr[j] != 0 )
                j++;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args){
        P7MovingZerostoEnd obj = new P7MovingZerostoEnd();
        obj.moveZerosToEnd(new int[] {1,0,9,8,7,0,5});

    }
}
