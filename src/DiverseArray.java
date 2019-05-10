

public class DiverseArray {

    
    public static int arraySum(int[] arr){
        /* To do in part (a) */
        return 0;

    }
    
    public static int[] rowSums(int[][] arr2D){
        /* To do in part (b) */
        return new int[] {0,1,2};

    }
    
    public static boolean isDiverse(int[][] arr2D){
        /* To do in part (c) */
        return false;
    }
    
    
    public static void main(String[] args){
        
        int[][] mat1={ 
            { 1, 3, 2, 7, 3},
            {10,10, 4, 6, 2},
            { 5, 3, 5, 9, 6},
            { 7, 6, 4, 2, 1}};

        int[][] mat2={ 
            { 1, 1, 5, 3, 4},
            {12, 7, 6, 1, 9},
            { 8,11, 10, 2, 5},
            { 3, 2, 3, 0, 6}};
        
        int res = arraySum(mat1[0]);
        System.out.println("Sum of array is (should be 16): "+ res);
        
        int[] res2 = rowSums(mat1);
        System.out.print("Sum of array's rows: (should be 16,32,28,20):   ");
        for (int ll=0; ll<res2.length ; ++ll)
            System.out.print(res2[ll] + " ,");
        
        System.out.println();
        
        System.out.println("First array is diverse (should be true):" + isDiverse(mat1));
        System.out.println("First array is diverse (should be false):" + isDiverse(mat2));
        
    }
        
}
    
    
