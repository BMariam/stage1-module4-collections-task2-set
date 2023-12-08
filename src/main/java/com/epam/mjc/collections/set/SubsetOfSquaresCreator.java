package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
	public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
		NavigableSet<Integer> subset = new TreeSet<>();
		for (int i = 0; i < sourceList.size(); ++i) {
			subset.add(sourceList.get(i) * sourceList.get(i));
		}	
		return subset.subSet(lowerBound, upperBound + 1);
	}
}
