class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        if(charArr.length == 0) return true;
        int left = 0, right = charArr.length - 1;
        boolean res = true;
        while(left < right) {
            // reversedArr[left] = charArr[right];
            if(charArr[left] == charArr[right]) {
                left++;
                right--;
                res = true;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }
}
