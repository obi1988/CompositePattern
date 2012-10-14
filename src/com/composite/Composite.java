package com.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {
	private String name;

	// list of State Components
	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		this.name = name;
	}

	public Component getChild(int i) {
		return components.get(i);
	}

	public void print() {
		System.out.println(" " + getName());
		Iterator<Component> iterator = components.iterator();
		while (iterator.hasNext()) {
			Component component = iterator.next();
			component.print();
		}
	}

	public String getName() {
		return name;
	}

	public void add(Component state) {
		components.add(state);
	}

}
