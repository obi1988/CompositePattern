package com.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Klasa implementująca interfejs Component, odpowiedzialna za reprezentację "węzła"
 * @author obi1988
 *
 */
public class Composite implements Component {
	private String name;
	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		this.name = name;
	}
/*
 * Pobranie obiektu podrzędnego
 * (non-Javadoc)
 * @see com.composite.Component#getChild(int)
 */
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
/*
 * Pobranie nazwy obiektu
 * (non-Javadoc)
 * @see com.composite.Component#getName()
 */
	public String getName() {
		return name;
	}
/*
 * Dodanie obiektu typu Component
 * (non-Javadoc)
 * @see com.composite.Component#add(com.composite.Component)
 */
	public void add(Component state) {
		components.add(state);
	}
}
