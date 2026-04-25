class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> freqMapS = new HashMap<>();
        for(char ch : s.toCharArray()){
            freqMapS.put(ch, freqMapS.getOrDefault(ch,0)+1);
        }

        for(Character ch : t.toCharArray()){
            if(!freqMapS.containsKey(ch) || freqMapS.get(ch) == 0) return false;
            freqMapS.put(ch,freqMapS.getOrDefault(ch,0)-1);
        }

        return true;
    }
}