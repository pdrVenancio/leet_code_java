import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Find_Median_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        double median  = 0.2;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            array.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            array.add(nums2[i]);
        }


        Collections.sort(array);

        if (array.size() % 2  ==  0){
        // par
            median =
        }else{
        // impar

        }

        System.out.println(array);

        return  median;
    }

   public static void  main(String[] args){
        Find_Median_Sorted_Arrays fmsa =  new Find_Median_Sorted_Arrays();

        int [] nums1 = {1,3};
        int [] nums2 = {2};

        double result = fmsa.findMedianSortedArrays(nums1, nums2);
        System.out.println();
   }
}
