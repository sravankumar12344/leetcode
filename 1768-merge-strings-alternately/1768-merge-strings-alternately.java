class Solution {
    public String mergeAlternately(String word1, String word2) {
        
       StringBuilder ans=new StringBuilder();
       int a=word1.length();
       int b=word2.length();
       int i=0;
       while(i<a || i<b)
       {
        if(i<a)
        {
            ans.append(word1.charAt(i));
        }
        if(i<b)
        {
            ans.append(word2.charAt(i));
        }
        i++;
       }
       return ans.toString();
        
    }
}