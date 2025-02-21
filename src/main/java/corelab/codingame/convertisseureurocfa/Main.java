package corelab.codingame.convertisseureurocfa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Float mtn, nvMnt = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le montant en euro a convertir en france Fr : ");
		mtn = sc.nextFloat();
		nvMnt = euroToCfa(mtn);
		System.out.println("  " + mtn + " euro valent " + nvMnt + " Franc CFA ...");

	}

	/**
	 * convertisseur : euro cfa rappelons : 1 eur = 655,63 Franc CFA
	 * 
	 * @param montantEuro
	 * @return
	 */
	public static Float euroToCfa(Float montantEuro) {
		Float res = 0.f;
		res = montantEuro * 655.63f;
		return res;
	}

}
