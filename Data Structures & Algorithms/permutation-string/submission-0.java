class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }

        int left = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int right=0;right<s2.length();right++){
            char c = s2.charAt(right);
            map2.put(c,map2.getOrDefault(c,0)+1);
            
            if(right-left+1 > s1.length()){
                char ch = s2.charAt(left);
                map2.put(ch,map2.get(ch)-1);
                if(map2.get(ch)==0){
                    map2.remove(ch);
                }
                left++;
            }

            if(map1.equals(map2)){
                return true;
            }
        }

        return false;
    }
}
