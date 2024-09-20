package Exercise;

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

    public void verify(){
        System.out.println("Index" + (this.count - 1));

    }
}
