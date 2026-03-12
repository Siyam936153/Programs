class Solution {
    public String reverseVowels(String s) {
        char []arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right&&!isVowel(arr[left])){
                left++;
            }
            while(left<right&&!isVowel(arr[right])){
                right--;
            }
             char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            }
            return new String(arr);
    }

    private boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
}
