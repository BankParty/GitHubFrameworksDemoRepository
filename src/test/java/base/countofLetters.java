package base;

import java.util.HashMap;

public class countofLetters {
    public static void main(String[] args) {
        String str = "This is an actual Test";
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        //int count = 0;
        str = str.toLowerCase(); 
        for(int i=0; i<str.length(); i++){
        	if(str.charAt(i) !=' ') {
        	hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        }
        for(char c : hm.keySet()) {
        	System.out.println(c + " : " + hm.get(c));
        }
    }
}
