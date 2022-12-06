package Week12.Date1205;
// 부모는 자식의 값보다 크거나 같아야 한다.
// 노드는 왼쪽에서 오른쪽 방향으로
// 깊이는 작은쪽에서 큰쪽으로

import java.util.Arrays;

public class HeapTrea2 {
    public static int[] makeHeap(int[] arr, int parentIdx) {
        if(parentIdx<0) return arr;
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx; // 가장 큰 값을 가진 idx

        // 왼쪽이 parent보다 크면 greaterIdx = leftIdx
        if(leftIdx < arr.length && arr[leftIdx]> arr[greaterIdx]) {// 자식 노드가 없을경우 비교자체가 이루어지지 않는다.
            greaterIdx = leftIdx;
        }
        // 오른쪽이 greater보다 크면 greaterIdx = leftIdx
        if(rightIdx < arr.length && arr[rightIdx]> arr[greaterIdx]) {// 자식 노드가 없을경우 비교자체가 이루어지지 않는다.
            greaterIdx = rightIdx;
        }

        // swap -> 교환이 안일어난다 = 이미 heap 만족
        // 교환이 일어났다면 아래의 자식노드와 heap을 만족하는지 한 번 더 체크해야한다.

        if(parentIdx != greaterIdx){
            int tmp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = tmp;
            makeHeap(arr,greaterIdx);
        }
        if(parentIdx>=0) parentIdx--;
        return makeHeap(arr, parentIdx);
    }

    public static void main(String[] args) {
//        int[] array = {6, 5, 7, 8};
        int[] array = {4,8,5,7,3,2,9,6,7};
        int[] heapArr = makeHeap(array, 4);
        System.out.println(Arrays.toString(heapArr));

//        heapArr = makeHeap(array, 0);
//        System.out.println(Arrays.toString(heapArr));


        /*int i = (array.length-1) /2;
        int n = i;
        if(i>= 1) {
            // root(n), left(2n), right(2n+1) 비교
            int max = Math.max(Math.max(array[n],array[2*n]),array[2*n+1]);
            if (max == array[n]){
                i = i - 1;
                n = i;
                System.out.println();
            } else if(max == array[2*n]) {
                n = 2*n;
            } else if(max == array[2*n+1]) {
                n = 2*n+1;
            }
        }*/

    }
}
