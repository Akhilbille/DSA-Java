package Exercise;

public class Main {

    public static void main(String[] args){
        Array arr1 = new Array(5);
        arr1.insert(1);
        arr1.insert(2);
        arr1.insert(3);
        arr1.insert(4);
        arr1.insert(5);
        arr1.insert(6);
        arr1.insert(7);

        arr1.removeAt(6);
        arr1.indexOf(9);
        arr1.max();
        arr1.print();
        arr1.intersect(new int[]{1,2,3,4,5});
        arr1.reverse();
        arr1.insertAt(8,8);


    }
}
