class SnapshotArray {

    private final Map<Integer, TreeMap<Integer, Integer>> map;
    int currsnap = 0;

    public SnapshotArray(int length) {
        map = new HashMap<>();     
    }
    
    public void set(int index, int val) {
        if(!map.containsKey(index)){
            map.put(index, new TreeMap<>());
        }
        map.get(index).put(currsnap,val);
        
    }
    
    public int snap() {
        currsnap++;
        return currsnap - 1;
    }
    
    public int get(int index, int snap_id) {
        return Optional.ofNullable(map.get(index))
            .map(treemap -> treemap.floorEntry(snap_id))
            .map(Map.Entry::getValue)
            .orElse(0);
    }
}

    // Map<Integer, Map<SnapId, Value>>
    // 0->4, snap(sid : 0), snap (sid :1)
    // get -> Binary Search

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */