package array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] y = new int[5];
        for(int index = 0; index < y.length; index++) {
            y[index] = index * 2 + 3;
        }
        for( int index = 0; index < y.length; index++) {
            System.out.println(y[index]);
        }

    }
}
