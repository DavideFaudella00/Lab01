package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {

	List<String> listaParole = new ArrayList<String>();

	public Parole() {
		// TODO
	}

	public void addParola(String p) {
		listaParole.add(p);
	}

	public List<String> getElenco() {
		List<String> listaParoleOrd = new LinkedList<String>(listaParole);
		Collections.sort(listaParoleOrd, new ComparatoreAlfabetico());
		return listaParoleOrd;
	}

	public void reset() {
		listaParole.clear();
	}

	public void cancellaParola(String s) {
		for (String ss : getElenco()) {
			if (ss.equals(s) == true) {
				listaParole.remove(ss);
			}
		}
	}
}
