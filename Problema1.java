package laborator7;

import java.util.*;
import java.io.*;

class Comparatorul implements Comparator<String> { 
    public int compare(String str1, String str2) 
    { 
        String first_Str; 
        String second_Str; 
        first_Str = str1; 
        second_Str = str2; 
        return second_Str.compareTo(first_Str); 
    } 
} 

public class Problema1 {
	
	public TreeSet printWords (String filename) {
		TreeSet<String> tree = new TreeSet<String>(); 
		File file = new File(filename);
	      Scanner myReader = new Scanner(file);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        tree.add(data);
	      }
	      myReader.close();
	      return tree;
	}

	public TreeSet printWordsComparator(TreeSet<String> tree) {
		TreeSet<String> tree2 = new TreeSet<String>(new Comparatorul());
		while (!tree.isEmpty()) {
			String data = tree.first();
			tree2.add(data);
			
		}
	}
	
	public static void main(String[] args) {
		

	}

}
