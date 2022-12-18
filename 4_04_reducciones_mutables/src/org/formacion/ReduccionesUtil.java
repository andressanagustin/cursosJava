package org.formacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Para las soluciones de estos ejercicios utiliza streams, las 
 * operaciones intermedias que necesites y una operaci�n terminal
 * con una estructura mutante.
 */
public class ReduccionesUtil {

	/**
	 * Devuelve una coleccion con los Strings de la lista original con:
	 *  - los nulls eliminados del resultado
	 *  - el resto pasado a may�sculas.
	 *  
	 *  Es decir, si pasamos
	 *  {"a",null,"b",null} debe devolver {"A","B"}
	 *  
	 */
	public Collection<String> obtenSinNulosYMayusculas(List<String> original) {

		return original.stream().filter(s->s!=null).map(s->s.toUpperCase()).collect(Collectors.toList());
//		Collection<String> result = new ArrayList<>();
//		original.stream()
//				.filter(it -> it != null)
//				.map(it -> it.toUpperCase())
//				.forEach(it ->result.add(it));
//		return result;
	}

	/**
	 * Devolver un array de dos enteros. En la posicion 0 con 
	 * el numero de pares encontrado en la lista de numeros y en 
	 * la posicion 1 el numero de impares
	 * 
	 * Por ejemplo, 
	 * si numeros es { 0, 1, 2, 4 } debe devolver [3,1]
	 */
	public int[] paresImpares (List<Integer> numeros) {
		
		/* Ir acumulando en la posicion 0 el recuento de pares
		 * y en la posicion 1 el recuento de impares
		 */
		int[] acumular = {0,0};

//		numeros.stream().filter(n-> n%2 == 0).forEach(s-> acumular[0]+=1);
//		numeros.stream().filter(n-> n%2 == 1).forEach(s-> acumular[1]+=1);
		numeros.stream().forEach(it -> acumular[it % 2] += 1);

		return acumular;
		
	}
	
}
