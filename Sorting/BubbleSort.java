package Sorting;

class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] + " "));
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swaps
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Enter the value ofN ) ;
        // // n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // System.out.println(arr[i] + " ");
        //
        int[] arr = { 8, 7, 1, 2, 3, 6, 4 };

        bubbleSort(arr);
        printArray(arr);

    }

}

// public static void bubbleSort(int[] arr,int n){

// if(n ==0 || n==1){
// // System.out.println("Inavalid Input");
// return;
// }
// for(int i=0;i<n-1;i++){
// if(arr[i] > arr[i+1]){
// swap(arr,i,i+1);
// }
// }
// bubbleSort(arr,n-1);
// }
// public static void swap(int[] arr,int i,int j){
// int temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }
// public static void printArray(int[] arr,int n){
// n=arr.length;
// for(int i=0;i<n;i++){
// System.out.print(arr[i]+" ");
// }
// System.out.println();
// }
// public static void main(String[] args) {
// int[] arr={2,1,5,3,9,8};
// int n=arr.length;
// System.out.println("Unsorted Array");
// printArray(arr,6);

// bubbleSort(arr,6);

// System.out.println("After Sorting");
// printArray(arr,n);

// }
// }
