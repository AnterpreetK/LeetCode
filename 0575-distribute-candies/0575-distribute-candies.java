class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        int maxAllowed = candyType.length/2;
        
        return Math.min(maxAllowed, set.size());
    }
}