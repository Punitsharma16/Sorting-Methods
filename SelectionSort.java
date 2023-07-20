import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
//            swap smallest element with the first element
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
//        print the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arr");
        int n = sc.nextInt();
        System.out.println("Enter the arr");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
    }
}
