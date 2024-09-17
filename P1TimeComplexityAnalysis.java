public class P1TimeComplexityAnalysis{
    public static void main(String[] args){
        long now = System.currentTimeMillis();
        findAvg(99999);
        System.out.println(System.currentTimeMillis() - now);


    }

    public static void findAvgFast(int num){
        int result = (num * (num + 1)) / 2;
        System.out.println(result);
    }

    public static void findAvg(int num){
        int sum = 0;
        for (int i =0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

}