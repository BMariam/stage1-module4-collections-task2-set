package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
	public HashSet<Integer> createHashSet(List<Integer> sourceList) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < sourceList.size(); ++i) {
			hashSet.add(sourceList.get(i));
			if (0 == sourceList.get(i) % 2) {
				int evenNumber = sourceList.get(i);
				while (0 == evenNumber % 2) {
					evenNumber /= 2;
					hashSet.add(evenNumber);
				}
			} else {
				hashSet.add(2 * sourceList.get(i));
			}
		}
		return hashSet;
	}
}
