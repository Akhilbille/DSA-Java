import java.util.Arrays;

public class P3RemovingEvenIntegers {

    public void printArray(int[] arr){
        int count = arr.length;
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void removeEven(int[] arr){
        int oddCount = 0;
        int arrLength = arr.length;
        for(int i = 0;i < arrLength;i++){
            if(arr[i]%2 !=0)
                oddCount++;
        }


        int[] oddArray = new int[oddCount];
        int idx = 0;
        for(int i =0;i<arrLength;i++){
            if(arr[i]%2 != 0)
                oddArray[idx++] = arr[i];

        }
        System.out.println(Arrays.toString(oddArray));
    }


    public static void main(String[] args){
        P3RemovingEvenIntegers removeEvenObj = new P3RemovingEvenIntegers();
        removeEvenObj.removeEven(new int[]{1,2,5,3,6,4,5,6});
    }
}
