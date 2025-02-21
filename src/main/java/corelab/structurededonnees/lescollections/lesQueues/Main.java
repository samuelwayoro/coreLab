package corelab.structurededonnees.lescollections.lesQueues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> tq = new PriorityQueue<>();
		tq.add(1000);
		tq.add(-1);
		tq.add(0);
		tq.add(69);
		tq.add(-900);
		tq.add(258);

		for (Integer integer : tq) {
			System.out.println(integer);
		}

	}

	static <T> void parcourAvecForEach(Queue<T> queue) {
		for (T t : queue) {
			System.out.println(t);
		}
	}

	/*
	 * static <T> void parcoursAvecBoucle(Queue<T> queue) { for (int i = 0; i <
	 * queue.size(); i++) { System.out.println(queue.get(i)); } }
	 */
	static <E> void parcoursAvecIterateur(Queue<E> queue) { // attention <E> pareil que <T>
		Iterator<E> ite = queue.iterator();
		while (ite.hasNext()) {
			System.out.println(ite);
		}
	}

	static <T> void parcoursAvecLambda(Queue<T> queue) {
		queue.forEach(m -> System.out.println(m));
	}

}
