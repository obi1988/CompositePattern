package com.composite;

public interface Component { 
	 public String getName();
	 public void add(Component c);
	 public Component getChild(int i);
	 public void print();
	}