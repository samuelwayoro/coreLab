package corelab.structurededonnees.genericite;

public class TestCouplet {

	public static void main(String[] args) {

		Couplet<Integer, String> tc = new Couplet<>(10, "Messi");
		System.out.println(tc.getClef()+" "+tc.getValeur());

	}

}
