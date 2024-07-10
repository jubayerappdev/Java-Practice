public class ArrayExcercise {
    public static void main(String[] args) {
        //Practice Problem -1
//        float marks [] = {55.6f, 68.7f, 44.6f, 77.8f, 100.0f};
//        float sum = 0;
//
//        for (float Element:marks){
//            sum= sum+Element;
//
//        }
//        System.out.println("The value of sum is : "+sum);

        //Practice Problem -2

//        float marks [] = {55.6f, 68.7f, 44.6f, 77.8f, 100.0f};
//        float num=44.6f;
//        boolean isArray = false;
//        for (float Element:marks){
//            if (num==Element){
//                isArray =true;
//                break;
//            }
//
//        }
//        if (isArray){
//            System.out.println("The value is present in the array");
//        }else {
//            System.out.println("The value is not in the array");
//        }
//        Problem Practice -3
//        float marks [] = {55.6f, 68.7f, 44.6f, 77.8f, 100.0f};
//        float sum = 0;
//
//        for (float Element:marks){
//            sum= sum+Element;
//
//        }
//        System.out.println("The value of sum is : "+sum/marks.length);

////        problem practice -4
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(); // Prints a new line
//        }
//        Problem Practice - 5
//
//        int [] arr = {1,2,3,4,5,6};
//        int l=arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i=0; i<=n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for (int element:arr){
//            System.out.print(element+" ");
//
//        }
        // Practice Problem 6
//        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//        int max = Integer.MIN_VALUE;
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        problem practice -7
//
//        int [] arr = {1,2100,3,455,5,34,67};
//        int min = Integer.MAX_VALUE;
//        for (int e:arr){
//            if (e<min){
//                min=e;
//            }
//        }
//        System.out.println("The value of the minimum element in this array is : "+min);

//     problem practice - 8
        boolean isSorted = true;
        int [] arr = {1,2100,3,455,5,34,67};
        for (int i = 0; i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("This array of number is sorted");
        }else {
            System.out.println("This array of number is not sorted");
        }
    }
}
