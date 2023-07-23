package com.infy;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("java", "spring", "boot","spring");

		asList.stream().filter(n->n.startsWith("s")).skip(1)
		
		
		
		//.distinct()
		
		
		//.limit(3)
		
		.forEach(name -> System.out.println(name));
		
		
	}

}
