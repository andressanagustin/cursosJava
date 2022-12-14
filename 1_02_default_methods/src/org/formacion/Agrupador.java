package org.formacion;

import java.util.Collection;
import java.util.List;

public interface Agrupador {

	void add (Object elemento);

	default void addAll (List<Object> elemento){
		for (Object item:elemento) {
			add(item);
		}
	}

	int numeroElementos();
	
}
