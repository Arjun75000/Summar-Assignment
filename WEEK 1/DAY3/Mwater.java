class Mwater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;

        while (l < r) {
            int w = r - l;
            int area = Math.min(height[l], height[r]) * w;

            maxArea = Math.max(maxArea, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
