package com.infotess.in;

import java.util.Iterator;
import java.util.TreeSet;

public class Employess implements Comparable<Employess> {
	public int age;

	@Override
	public int compareTo(Employess st) {
		if (age == st.age)
			return 0;
		else if (age >= st.age)
			return 1;
		else
			return -1;
	}

	

	public static void main(String[] args) {
		System.out.println("CHANDU WELCOME");
		Employess employess = new Employess();
		Employess employess2 = new Employess();
		employess.age = 96;
		employess2.age = 74;
		TreeSet<Employess> treeSet = new TreeSet<>();
		treeSet.add(employess);
		treeSet.add(employess2);
		// Iterator<Employess> iterator = treeSet.iterator();
		Iterator<Employess> iterator = treeSet.iterator();

		while (iterator.hasNext())
			;
		{
			System.out.println(iterator.next());
		}
	}

}