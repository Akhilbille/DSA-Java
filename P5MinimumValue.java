public class P5MinimumValue {

    public void minValue(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            if (min > arr[i]) min=arr[i];
        }
        System.out.println(min);

    }
    public static void main(String[] args){
        P5MinimumValue obj = new P5MinimumValue();
        obj.minValue(new int[] {-10,5,6,3,4,-7});
    }
}
