package com.composite;
/**
 * Klasa implementująca interfejs Komponent, odpowiedzialna za reprezentację "liścia"
 * @author obi1988
 *
 */
public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("   " + getName());
	}

	public String getName() {
		return name;
	}

	public void add(Component c) {

	}

	public Component getChild(int i) {
		return null;
	}

}