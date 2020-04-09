public class InsertionSort {
    public void insertionSort(int[] array) {

        for(int i = 1; i < array.length ; i++) {

            int currIndex = i;
            while(currIndex > 0 && array[currIndex-1] > array[currIndex]) {
                replace (currIndex-1, currIndex, array);
                currIndex--;
            }
        }
    }

    public void replace(int replacedFromLoc, int originalVariableLoc, int[] array) {
        int temp = array[originalVariableLoc];
        array[originalVariableLoc] = array[replacedFromLoc];
        array [replacedFromLoc] = temp;
    }

    public static void main(String[] args) {
        int[] array= {10, 19, 26, 1, 4, 0, 9, 11, 5, 28, 19};
        InsertionSort ssObject = new InsertionSort();
        for(int i = 0; i <array.length ; i ++) {
            System.out.print( array[i] +"   ");
        }
        System.out.println();
        ssObject.insertionSort(array);
        for(int i = 0; i <array.length ; i ++)
            System.out.print(array[i] + "   ");
    }
}
