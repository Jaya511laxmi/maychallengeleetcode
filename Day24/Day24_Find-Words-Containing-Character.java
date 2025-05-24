class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> arr1 = new ArrayList<>();

        int count = 0;
        for(String ch : words)
        {
            if(ch.contains(String.valueOf(x)))
            {
                arr1.add(count);
            }
            count++;
        }
        return arr1;
    }
}
