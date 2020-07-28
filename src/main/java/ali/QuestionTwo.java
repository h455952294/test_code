package ali;

public class QuestionTwo {

    public static int singleNumber(int[] nums) {
        int a = 0;
        for(int i=0; i<nums.length; i++) {
            a = a^nums[i];
        }
        return a;
    }

    public static void main(String[] args) {
        //int[] a = {2,2,1,3,3,4,4};
        int[] a = {4,1,2,1,2};
        System.out.println(singleNumber(a));
    }
}
