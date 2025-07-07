class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int maxlen = 0, currlen = 0;
        for(int l = 0, r = 0; r < fruits.length; r++){
            basket.put(fruits[r], basket.getOrDefault(fruits[r], 0)+1);

            while(basket.size() > 2){
                basket.put(fruits[l], basket.get(fruits[l])-1);
                if(basket.get(fruits[l])==0){
                    basket.remove(fruits[l]);
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}