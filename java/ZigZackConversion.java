class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s.length()<=numRows){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        int c=2*(numRows-1);
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=c){
                sb.append(s.charAt(j));
                int d=j+c-2*i;
                if(i!=0 &&i!=numRows-1&&d<s.length()){
                    sb.append(s.charAt(d));

                }
            }
        }
        return sb.toString();
    }
}
