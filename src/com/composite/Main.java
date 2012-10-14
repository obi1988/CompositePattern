package com.composite;

public class Main {
	public static void main(String[] args) {
		  Component leaf = new Leaf("Wydruki");
		  Component leaf2 = new Leaf("Informacje");
		  Component composite = new Composite("Aktywności");
		  Component leaf3 = new Leaf("Lista Oczekujących");
		  Component leaf4 = new Leaf("Moje");
		  Component composite2 = new Composite("Sprawy");
		  Component leaf5 = new Leaf("Zmień hasło");
		  
		  
		  Component base = new Composite("Menu Główne");
		  Component base2 = new Composite("Administracja");
		  
		  base.add(leaf);
		  base.add(leaf2);
		  base.add(composite);
		  composite.add(leaf3);
		  composite.add(leaf4);
		  base.add(composite2);
		  composite2.add(leaf3);
		  composite2.add(leaf4);
		  base2.add(leaf5);
		  
		  
		  base.print();
		//  System.out.println( base.getChild(1).getName());
		 }
		
}