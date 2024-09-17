public class P2ArraysUtil {

    public void printArray(int[] arr){
        int count = arr.length;
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public  void arrayDemo(){
        int[] arr = new int[5];
        printArray(arr);
        System.out.println();
        arr[0] =  1;
        arr[1] =  3;
        arr[2] =  7;
        arr[3] =  9;
        arr[4] =  5;

        printArray(arr);

        //Creating array by directly assigning
        int[] arr2 = {1,2,3,4,5,6};
        printArray(arr2);
    }

    public static void main(String[] args){
        P2ArraysUtil arr1 = new P2ArraysUtil();
        arr1.arrayDemo();
    }
}
