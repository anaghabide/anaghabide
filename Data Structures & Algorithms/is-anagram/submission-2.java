class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freqMapS = new HashMap<>();
        for(Character c : s.toCharArray()){
            freqMapS.put(c, freqMapS.getOrDefault(c, 0)+1);
        }

       /* Map<Character, Integer> freqMapT = new HashMap<>();
        for(Character c : t.toCharArray()){
            freqMapT.put(c, freqMapT.getOrDefault(c, 0)+1);
        }

        return freqMapS.equals(freqMapT); */


        /*for(Character c : t.toCharArray()){
            if(!freqMapS.containsKey(c) || freqMapS.get(c) == 0) return false;
            freqMapS.put(c, freqMapS.get(c) - 1);
        }*/

        int charArr[] = new int[26];

        for(int i=0; i<s.length(); i++){
            charArr[s.charAt(i) - 'a'] ++;
            charArr[t.charAt(i) - 'a'] --;
        }

        for(int num : charArr){
            if(num != 0) return false;
        }

        return true;
    }
}