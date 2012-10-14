package com.composite;

/**
 * Główna klasa aplikacji, 
 * @author obi1988
 *
 */
public class Main {
	public static void main(String[] args) {
		Component leafBaseOne = new Leaf("Wydruki");
		Component leafBaseTwo = new Leaf("Informacje");
		Component nodeA = new Composite("Aktywności");
		Component leafOne = new Leaf("Lista Oczekujących");
		Component leafTwo = new Leaf("Moje");
		Component nodeS = new Composite("Sprawy");
		Component leafBaseAOne = new Leaf("Zmień hasło");
		Component base = new Composite("Menu Główne");
		Component baseA = new Composite("Administracja");

		base.add(leafBaseOne);
		base.add(leafBaseTwo);
		base.add(nodeA);
		nodeA.add(leafOne);
		nodeA.add(leafTwo);
		base.add(nodeS);
		nodeS.add(leafOne);
		nodeS.add(leafTwo);
		baseA.add(leafBaseAOne);

		base.print();
	}

}