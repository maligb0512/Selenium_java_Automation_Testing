package practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {
public static void main(String [] args) {
	
	String str="abc abc abc abac abavf abgdf abc";
	String s[]=str.split(" ");
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	for(int i=0;i<=s.length-1;i++) {
		String s1 = s[i];
		
		if(map.containsKey(s1)) {
			map.put(s1, map.get(s1)+1);
		}else {
			map.put(s1, 1);
		}
		
	}
	Set<String> keys = map.keySet();
	for(String key:keys) {
		System.out.println(key+":"+map.get(key));
	}
	
	
	
}
}
