package coreLab.core.genericite;

public class TestCouplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Couplet<Integer, String> tc = new Couplet<>(10, "Messi");
		System.out.println(tc.getClef()+" "+tc.getValeur());

	}

}
