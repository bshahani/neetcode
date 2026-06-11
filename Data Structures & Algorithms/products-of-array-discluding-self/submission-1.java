class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, countZero = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0)
                product *= nums[i];
            else 
                countZero++;
                if (countZero > 1)
                    return new int[nums.length];
        }

        int[] productArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (countZero == 1) {
                if (nums[i] == 0)
                    productArr[i] = product;
            } else 
                productArr[i] = product / nums[i];
        }

        return productArr;
    }
}  
