public class P4ReverseArray {

    public void printArray(int[] arr){
        int count = arr.length;
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }

    public static void main(String[] args){
        P4ReverseArray obj = new P4ReverseArray();
        obj.reverseArray(new int[] {1,2,3,4,5});

    }
}
