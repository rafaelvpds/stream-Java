package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		System.out.println("Criando uma STREAM a partir de uma coleção");
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);

		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println();

		System.out.println("Criando uma STREAM a partir do stream.of");

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		System.out.println();

		System.out.println("Função de interação");
		// interate:quem e o primeiro elemento da stream / função de interação dos
		// proximos elementos // ela potencialmente infinita
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

		// Para processar e nao entrar em loop, precisa-se colocar uma função que limita
		// a interação

		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		System.out.println();

		System.out.println("Sequecia de fibonate");

		Stream<Long> st4 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
