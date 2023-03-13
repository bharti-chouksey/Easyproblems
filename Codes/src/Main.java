import java.util.*;   
class Main {
//    public int lengthOfLongestSubstring(String s) {
//        int len = s.length(),left = 0,right =0,max=0;
//        Set<Character> seen = new HashSet();
//        while(right < len){
//            char c = s.charAt(right);
//            if(seen.add(c)){
//                max = Math.max(max,right-left+1);
//                right++;
//            }
//            else{
//                while(s.charAt(left) != c){
//                    seen.remove(left);
//                    left++;
//                }
//                seen.remove(c);left++;
//            }
//        }
//        return max;
//        
//    }
	public int lengthOfLongestSubstring(String s) {
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
        	
        	
        }
        
    
    public static void main(String args[]){
        Main s = new Main();
        int ans = s.lengthOfLongestSubstring("tmmzuxt");
        System.out.println(ans);
    }
}
