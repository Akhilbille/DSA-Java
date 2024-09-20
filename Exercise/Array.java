package Exercise;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
        count = 0;
    }

    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int val){
        if(count >= items.length){
            int[] temp = new int[items.length*2];
            for(int i =0; i<items.length;i++){
                temp[i] = items[i];
            }
            items =temp;
        }
        items[count++] = val;

    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index out of range.");
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void indexOf(int value){
        for(int index = 0; index < count; index++){
            if(items[index] == value)
            {
                System.out.println(index);
                break;
            }
        }
        System.out.println(-1);
    }

    public void max(){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < count ; i++){
            if(items[i] > max)
                max = items[i];
        }
        System.out.println("Max Value : " + max);
    }

    public void intersect(int[] arr2){
        int maxLength = (Math.max(items.length, arr2.length));
        int[] temp = new int[maxLength];
        int tempIndex = 0;
        for(int i=0; i< items.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(items[i] == arr2[j]){
                    temp[tempIndex++] = items[i];
                }

            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public void reverse(){
        int start = 0;
        int end = items.length -1;
        int temp = 0;
        while(start < end){
            temp = items[start];
            items[start] = items[end];
            items[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(items));
    }

    public void insertAt(int index,int val){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Out of Range");
        for (int i = index; i < count; i++) {
            items[i+1] = items[i];
        }
        items[index] = val;
        count++;
        System.out.println(Arrays.toString(items));
    }
}
