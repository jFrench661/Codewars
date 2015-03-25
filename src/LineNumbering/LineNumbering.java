package LineNumbering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class LineNumbering {
	
public static void main(String[] args) {
		
		System.out.println(number(Arrays.asList("a","b","c")));
		
	}

    static List<String> number(List<String> lines) {
    	List<String> list = new ArrayList<String>();
        for(int i = 0; i < lines.size(); i++){
        	list.add(String.format("%d: %s", i, lines.get(i)));
        }
        
        return list;
    }

}
