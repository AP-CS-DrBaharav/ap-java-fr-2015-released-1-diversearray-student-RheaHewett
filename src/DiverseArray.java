

public class DiverseArray {

    
    public static int arraySum(int[] arr){
        /* To do in part (a) */
        //return 0;
        int sum = 0;
        for (int ii=0; ii<arr.length; ++ii)
            sum += arr[ii];
        return sum;
    }
    
    public static int[] rowSums(int[][] arr2D){
        /* To do in part (b) */
        //return new int[] {0,1,2};

        int[] out = new int[arr2D.length];
        
        for (int rr=0; rr<arr2D.length ; ++rr)
            out[rr] = arraySum(arr2D[rr]); 
        
        return out;
    }
    
    public static boolean isDiverse(int[][] arr2D){
        /* To do in part (c) */
        //return false;
        int[] vec ;
        vec = rowSums(arr2D);
        
        for (int ii=0; ii<arr2D.length ; ++ii) {
            int val1 = vec[ii];
            for (int jj=ii+1; jj<arr2D.length ; ++jj)
                if (val1 == vec[jj]) return false;
        }
        return true;
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
    
    
