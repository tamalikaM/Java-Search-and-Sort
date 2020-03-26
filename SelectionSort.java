public class SelectionSort {
    public int[] selectionSort(int[] array ) {
        // The comparison is done by counter variable j. It compares till the last element. So i can be < j as j = i+1
        for(int i =0; i < array.length-1; i++) {
            int index = i;
            for (int j =i+1; j <array.length; j++) {
                if(array[index] > array[j]) {
                    index = j;
                }
            }
            replace (index, i, array);
        }
        return array;
    }

    public void replace(int replacedFromLoc, int originalVariableLoc, int[] array) {
        int temp = array[originalVariableLoc];
        array[originalVariableLoc] = array[replacedFromLoc];
        array [replacedFromLoc] = temp;
    }

    public static void main(String[] args) {
        int[] array= {10, 19, 26, 1, 4, 0, 9, 11, 5, 28, 19};
        SelectionSort ssObject = new SelectionSort();
        for(int i = 0; i <array.length ; i ++) {
            System.out.print( array[i]);
        }
        int[] array1 = ssObject.selectionSort(array);
        for(int i = 0; i <array.length ; i ++)
            System.out.print("New Array   :" + array1[i]);
    }
}
