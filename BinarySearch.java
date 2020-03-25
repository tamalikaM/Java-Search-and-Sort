public class BinarySearch {
    public int binarySearch(int[] searchArray, int searchItem) {
        int begin = 0;
        int end = searchArray.length - 1;
        int middle = computeMiddle(end,begin);
        return search(begin, middle, end, searchArray, searchItem);
    }

    public int search(int begin, int middle, int end, int[] searchArray, int searchItem) {

        int result = -1;
        if (searchItem == searchArray[middle])
            return middle;
        else {
            if(searchItem < searchArray[middle] && end >= begin) {
                end = middle - 1;
                middle = computeMiddle(end, begin);
                return search(begin,middle,end,searchArray,searchItem);
            }

            else if(searchItem > searchArray[middle] && end >= begin) {
                begin = middle + 1;
                middle = computeMiddle(end, begin);
                return search(begin,middle,end,searchArray,searchItem);
            }
        }
        return -1;
    }

    public int computeMiddle(int end, int begin) {
        return  begin + (end - begin)/2;
    }

    public static void main(String[] args) {
        int[] searchArray = {1,8,9,21,48,75, 98};
        int searchItem = 1;
        BinarySearch object = new BinarySearch();
        int result = object.binarySearch(searchArray, searchItem);
        System.out.println("Result is " + result);
    }
}
