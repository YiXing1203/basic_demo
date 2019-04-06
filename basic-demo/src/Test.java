public class Test {
    /**
     * 输入一个整数，反转输出
     */

        public static void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) return;
            int count = 0;
            for(int num : nums){
                if(num!=0) nums[count++] = num;
            }
            while(count<nums.length)
                nums[count++] = 0;
        }

        public static void main(String[] args) {
            int[] arr= {0, 1, 0, 3, 12};
            moveZeroes(arr);
            for (int i : arr) {
                System.out.println(i);
            }
        }

    }

