import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] array = { 3, 5, 7 , 1 , 4 , 6 , 8 , 2};
        cyclicSort(array);
        System.out.print(Arrays.toString(array));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        int temp = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]  ){
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }
    }
}






