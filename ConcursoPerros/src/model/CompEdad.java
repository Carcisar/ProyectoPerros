package model;

import java.util.Comparator;

public class CompEdad implements Comparator <Perro>{

	@Override
	public int compare(Perro o1, Perro o2) {
		int comp;
		 comp = o1.getEdad().compareTo(o2.getEdad());
		return 0;
	}

}
