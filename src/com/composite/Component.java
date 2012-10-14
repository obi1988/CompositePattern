package com.composite;
/**
 * Interfejs Component
 * @author obi1988
 *
 */
public interface Component {
	public String getName();

	public void add(Component c);

	public Component getChild(int i);

	public void print();
}