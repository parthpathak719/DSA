class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        int i = 0;
        while (i < size && n > 0) {
            boolean left = (i == 0 || flowerbed[i - 1] == 0);
            boolean right = (i == size - 1 || flowerbed[i + 1] == 0);
            if (flowerbed[i] != 1 && left && right) {
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }
        if (n > 0) {
            return false;
        } else {
            return true;
        }
    }
}