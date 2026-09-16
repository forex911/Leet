// Last updated: 9/16/2026, 2:06:16 PM
class Solution {
    static boolean[] visit;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visit=new boolean[rooms.size()];
        for(int i=0;i<rooms.size();i++){
            visit[i]=false;
        }
        dfs(0,rooms);
        for(boolean i:visit){
            if(!i){
                return false;
            }
        }
        return true;
    }
    static void dfs(int start,List<List<Integer>> rooms){
        visit[start] = true;
        for(int i:rooms.get(start)){
            if(visit[i]==false){
                dfs(i,rooms);
            }
        }
    }
}