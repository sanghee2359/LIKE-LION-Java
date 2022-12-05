package Week12.Date1205;

import java.util.Arrays;

// index
// root(1), 왼쪽 자식 노드(2n+1 = 3), 오른쪽 자식 노드(2n+2=4)
public class HeapTree1 {
    public static void main(String[] args) {
        int[] array = {6, 5, 7, 8};

        System.out.println(Arrays.toString(array));
        int left =array.length-1;
        int root = (left-1)/2;
        if(array[left] > array[root]) {
            int tmp = array[left];
            array[left] = array[root];
            array[root] = tmp;
        }
        System.out.println(Arrays.toString(array));

        left = 1;
        root = (left-1)/2;
        if(array[left] > array[root]) {
            int tmp = array[left];
            array[left] = array[root];
            array[root] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
