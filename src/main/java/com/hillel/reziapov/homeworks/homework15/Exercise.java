package com.hillel.reziapov.homeworks.homework15;

public class Exercise {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int i = 0;
        for (char aChar : text.toCharArray()) {
            switch (aChar) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        return Math.min(Math.min(Math.min(b, a), n), Math.min(l / 2, o / 2));
    }

}
