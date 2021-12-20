package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoNaoOrdenadoSeT {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); 
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add("x");
		
		//Colecões não suportam tipos primitivos
		//por isso, eles são automaticamente convertidos
		//para as wrapper class. Ex: int --> Integer
		//SET --> São conjuntos não ordenados
		// 	  --> Não indexados e que não aceitam repetição
		
		System.out.println(conjunto.size()); 
		//Size: ver o tamanho do conjunto
		System.out.println(conjunto.remove(10));
		//retorna falso porque 10 não existe no conjunto
		System.out.println(conjunto.remove("x"));
		//retorna verdadeiro porque o elemento foi removido
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(true);
		System.out.println(nums);
		
		conjunto.addAll(nums);
		//realiza a união entre os conjuntos
		System.out.println(conjunto);
		
		nums.retainAll(conjunto);
		//realiza a intersecção entre os conjuntos
		System.out.println(nums);
		
		conjunto.clear();
		System.out.println(conjunto);
		//apaga todos os dados
	}

}
