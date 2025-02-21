package corelab.codingame.tritableaucaracteres;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private static Logger LOG = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		int[] integerTab = { 15, 25, 84, 11, 500, -9, 56, 75, 589 };
		trier(integerTab);
	}

	static void trier(int[] tab) {
		LOG.info("tableau avant trie : ");
		LOG.log(Level.INFO, Arrays.toString(tab));
		LOG.info("tableau après trie :");
		Arrays.sort(tab);
		LOG.log(Level.INFO, Arrays.toString(tab));

	}

}
