public class P9FindMissingNumberFrom1toN {

    public void findMissing(int[] arr){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        for(int i:arr){
            sum-=i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args){
        P9FindMissingNumberFrom1toN obj = new P9FindMissingNumberFrom1toN();
        obj.findMissing(new int[]{1,2,3,5});
    }
}
