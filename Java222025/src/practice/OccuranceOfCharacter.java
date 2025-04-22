package practice;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfCharacter {
	
	public static void main(String [] args) {
		
		String str="axbvdbasdafnfngfgdjblfvl";
		char[] c = str.toCharArray();
		
		HashMap <Character,Integer> map= new HashMap <Character,Integer> ();
		for(int i=0;i<=c.length-1;i++) {
			
			char c1=c[i];
			
			if(map.containsKey(c1)){
				map.put(c1,map.get(c1)+1);
				
				
			}else {
				map.put(c1, 1);
			}
			
			
			
			
			
		}
		Set<Character> keys = map.keySet();
		for(Character key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		
		
	}

	

	

}
