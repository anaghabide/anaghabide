class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

           anagramMap.computeIfAbsent(Arrays.toString(ch), key -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());

    }
}
