// Adam Weld
// CSE2
// HW11
// Matrix Sorter

import java.util.*;
public class MatrixSorter{
    public static int[][][] buildMat3d() {
        Random rand = new Random();
        int[][][] result = new int[3][][]; // 3 slabs
        for(int i = 0; i < 3; i++) { // for each slab
            result[i] = new int[3 + 2 * i][]; // rows
            for(int o = 0; o < result[i].length; o++) { //for each row
                result[i][o] = new int[i + o + 1]; // columns 
                for(int p = 0; p < result[i][o].length; p++) { // for each column
                    result[i][o][p] = rand.nextInt(100); // random num
                }
            }
        }
        return result;
    }
    public static void show(int[][][] x) {
        for(int s = 0; s < x.length; s++) { // for each slab...
            System.out.println("---------------Slab " + (s+1));
            for(int j = 0; j < x[s].length; j++) { // for each row index
                System.out.println(Arrays.toString(x[s][j])); // print column
            }
        }
    }
    public static int findMin(int[] x) { // find min of 1d array
        int iMin = x[0];
        for(int i = 1; i < x.length; i++) {
           if(x[i] < iMin) iMin = x[i]; 
        }
        return iMin;
    }
    public static int findMin(int[][] x) { // find min of 2d array
        int iMin = x[0][0];
        for(int i = 1; i < x.length; i++) { // rows
            if(findMin(x[i]) < iMin) iMin = findMin(x[i]); // calls findMin of 1d array each row
        }
        return iMin;
    }
    public static int findMin(int[][][] x) { // find min of 3d array
        int iMin = x[0][0][0];
        for(int i = 1; i < x.length; i++) {
            if(findMin(x[i]) < iMin) iMin = findMin(x[i]);
        }
        return iMin;
    }
    public static void sort(int[][] x) {
        for(int i = 0; i < x.length; i++) { // sort each row
            sort(x[i]); // calls other version of overloaded method
        }
        for(int j = 1; j < x.length; j++) { // insertion sort by first member
            int tempJ = j; // index which can be moved backwards
            while(x[tempJ][0] < x[tempJ-1][0]) { // swap if value is less than value to its left
                int[] temp = x[tempJ]; // swap
                x[tempJ] = x[tempJ-1];
                x[tempJ-1] = temp;
                if(tempJ > 1) tempJ--; // checks array bounds
            }
            
        }
    }
    public static void sort(int[] x) { // sort 1d array
        int jMin, temp;
        for(int i = 0; i < x.length - 1; i++) { // you dont need to run for last array value
            jMin = i; // index of min val starts at outer loop index
            for(int j = i + 1; j < x.length; j++) { // check values after i
                if(x[j] < x[jMin]) jMin = j;
            }
            if(jMin != i) { // if the jMin value has changed
                temp = x[i]; // swap
                x[i] = x[jMin];
                x[jMin] = temp;
            }
        }
    }
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
}
