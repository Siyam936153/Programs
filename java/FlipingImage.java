class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
        int first=0;
        int last=image.length-1;
        while(first<=last){
            if(image[i][first]==image[i][last]){
                image[i][first]^=1;
                image[i][last]=image[i][first];
            }
            first++;
            last--;
            }
       }
       return image; 
    }
}
