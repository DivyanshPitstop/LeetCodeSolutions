class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet set = new HashSet<>();
        int count = 0;
        for(int i =0 ; i<words.length;i++){
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }
    String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}