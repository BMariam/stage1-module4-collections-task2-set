package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetCombinationCreator {
	public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
		HashSet<String> combinationSet = new HashSet<>();
		Iterator<String> firstIterator = firstSet.iterator();
		while (firstIterator.hasNext()) {
			String element = firstIterator.next();
			if (secondSet.contains(element) && !thirdSet.contains(element)) {
				combinationSet.add(element);
			}
		}
		Iterator<String> thirdIterator = thirdSet.iterator();
		while (thirdIterator.hasNext()) {
			String element = thirdIterator.next();
			if (!firstSet.contains(element) && !secondSet.contains(element)) {
				combinationSet.add(element);
			}
		}	
		return combinationSet;
	}
}
