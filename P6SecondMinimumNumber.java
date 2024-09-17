public class P6SecondMinimumNumber {

    public void secondMinimum(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0;i < arr.length; i++ ){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void main(String[] args){
        P6SecondMinimumNumber obj =new P6SecondMinimumNumber();
        obj.secondMinimum(new int[]{2,36,4,5,6});

    }
}
