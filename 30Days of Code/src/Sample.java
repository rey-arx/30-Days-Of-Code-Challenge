public class Sample {
    public static void main(String[] args) {
        int[] array = { 1,2,3};
        int search = 3;
        System.out.println( "celiling is : " + Binarysearch(array , search ));
    }

    private static int Binarysearch(int [] array , int search)
    {
        int start = 0;
        int end = array.length-1;
        while(start<=end){
             int mid = start + (end-start)/2;
            if(search < array[mid])
                end = mid -1;
            else if(search > array[mid])
                start = mid+1;
            else
                return mid;
        }
        return end;
    }
    public static void sear(){

    }
}
