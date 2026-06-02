class Msubarray {
    public double findMaxAverage(int[] nums, int k) {
        int avg_value = 0;
        for(int i =0;i < k ; i++){
            avg_value += nums[i];
        }

        int max_sum = avg_value;
        for(int i = k; i < nums.length; i++){
            avg_value = (avg_value - nums[i -k] + nums[i]);
            max_sum = Math.max(max_sum, avg_value);
        }

        return (double) max_sum / k;
        
    }
}