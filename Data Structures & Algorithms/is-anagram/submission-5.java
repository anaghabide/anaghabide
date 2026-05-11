class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for(Character c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        for(Character c:t.toCharArray()){
            if(!freqMap.containsKey(c) || freqMap.get(c) == 0 )
                return false;
            freqMap.put(c, freqMap.getOrDefault(c,0) - 1);
            
        }

        return true;
    }
}
