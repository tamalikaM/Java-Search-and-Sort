public class MergeSort {

    public static void main(String[] args) {
        int[] array= {10, 19, 26, 1, 4, 0, 9, 11, 5, 28, 19};

        System.out.println(array.toString());
        mergeSort(array, new int[array.length], 0, array.length-1);
        System.out.println(array.toString());
    }

    public static void mergeSort(int[] array, int[] temp, int start, int end) {

        if(start >= end)
            return;

        int mid = (start+end)/2;
        mergeSort(array,temp,start,mid);
        mergeSort(array,temp,mid+1,end);
        merge(array, temp, start, mid, end);
    }

    public static void merge(int[] array, int[] temp, int leftStart, int leftEnd, int rightEnd) {
        int index = leftStart;
        int rightStart = leftEnd+1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart;
        int right = rightStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(array[left] > array[right]) {
                temp[index] = array[right];
                right++;
            }
            else
                {
                temp[index] = array[left];
                left++;
            }
         index++;
        }

        System.arraycopy(array,left,temp,index,leftEnd-left+1);
        System.arraycopy(array,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,array,leftStart,size);


    }
}
