import java.util.ArrayList;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstring("abcabc"));
	}
	
    public static int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        ArrayList<Character> arr = new ArrayList<Character>(sLength);
        int longest = 0;
        for (int i = 0; i < sLength; i++){
        	sLength=s.length();
           if (i < sLength - longest && sLength != 2){
                if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
                longest++;
                s = s.substring(i);
                }            
           }else{
                arr = new ArrayList<Character>(sLength);
                    
            }
                      
        }
        return longest;
    }

}
