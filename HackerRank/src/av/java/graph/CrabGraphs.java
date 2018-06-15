package av.java.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CrabGraphs {

	public static void main(String[] args) {
		int[][] inputEages = {
								{1, 2}, 
								{2, 3}, 
								{3, 4},  
								{4, 5},  
								{5, 6},  
								{6, 1},  
								{1, 4},  
								{2, 5}
							};
		findMax(6,3,inputEages);
		
		System.out.println("***********************");
		int[][] inputEages_2 = {
								{1, 4},
								{2, 4},  
								{3, 4},  
								{5, 4},  
								{5, 8},  
								{5, 7},  
								{5, 6}
		};
		
		findMax(8, 2,inputEages_2);
		 

	}
	
	public static void findMax(int vertix, int t, int[][] inputEages) {
		
		Map<Integer, Long> countMap = Arrays.stream(inputEages)
											.flatMapToInt(eages -> Arrays.stream(eages))
											.boxed()
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(countMap);
		
		Map<Integer, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
		countMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue()
                        .reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		System.out.println(finalMap);
		
		Set<Integer> headSet = new HashSet<>();
		for(Map.Entry<Integer, Long> entry : finalMap.entrySet()) {
			if(entry.getValue()>=2) {
				headSet.add(entry.getKey());
			}else {
				break;
			}
		}
		
		System.out.println(headSet);
		
		Map<Integer, Set<Integer>> vertixMap = new LinkedHashMap<>();
		//for(Integer head : headSet) { 
		for(Integer head : countMap.keySet()) { 
			Set<Integer> nodeSet = new HashSet<>();
			for(int[] eage : inputEages) {
				List<Integer> nodeList = Arrays.stream(eage).boxed().collect(Collectors.toList());
				if(nodeList.contains(head))
					nodeSet.addAll(nodeList);
			}
			//nodeSet.remove(head);
			vertixMap.put(head, nodeSet);
		}
		
		System.out.println(vertixMap);
		
		//Set<Integer> testSet = new HashSet<>(vertix);
		
		Set<Integer> coverVertixSet = new HashSet<>(vertix);
		Set<Integer> coverNodeSet = new HashSet<>();
		
		for(Integer head : headSet) {
			Set<Integer> nodeSet = vertixMap.get(head);
			for(Integer node : nodeSet) {
				if(coverNodeSet.size()==t) {
					coverVertixSet.add(head);
					break;
				}
				Set<Integer> nodeAdjSet = vertixMap.get(node);
				nodeAdjSet.remove(head);
				nodeAdjSet.remove(node);
				if(nodeAdjSet!=null) {
					nodeAdjSet.retainAll(headSet);
				}else {
					coverNodeSet.add(node);
				}
			}
		}
		
		
		/*for(Map.Entry<Integer, Long> entry : finalMap.entrySet()) {
			//if(headSet.size()<2)
			//	break;
			
			Set<Integer> coverVertix = vertixMap.get(entry.getKey());
			for(Integer v : coverVertixSet) {
				if(coverVertix!= null && coverVertix.contains(v)) {
					coverVertix.removeAll(vertixMap.get(v));
				}
			}
			
			System.out.println("Befor: "+headSet+" :: "+coverVertix);
			if(coverVertix!= null && headSet != null) {
				if(headSet.containsAll(coverVertix)) {
					headSet.removeAll(coverVertix);
					coverVertixSet.add(entry.getKey());
					coverNodeSet.addAll(coverVertix);
					System.out.println("After: "+headSet);
				}else {
					for(Integer v : coverVertix) {
						if(headSet.contains(v)) {
							headSet.remove(v);
							coverVertixSet.add(entry.getKey());
							coverNodeSet.add(v);
						}
					}
				}
			}
			
		}
		*/
		System.out.println("Result: "+coverVertixSet+" -- "+coverNodeSet);
	}

}
