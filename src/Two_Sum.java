import java.util.Arrays;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] resposta =  new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    resposta[0] = i;
                    resposta[1] = j;
                    return resposta;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Two_Sum ts = new Two_Sum();
        int[] resultado = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(resultado));
    }
}

