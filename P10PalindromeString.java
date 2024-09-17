public class P10PalindromeString {

    public Boolean isPalindrome(String str){
        char[] strArr = str.toCharArray();
        int start = 0;
        int end = strArr.length-1;
        while(start<end){
            if(strArr[start]!=strArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return  true;


    }

    public static void main(String[] args){
        P10PalindromeString obj = new P10PalindromeString();
        System.out.println( obj.isPalindrome("mom"));

    }
}
