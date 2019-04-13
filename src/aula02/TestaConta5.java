package aula02;

public class TestaConta5 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nome = "joao";
		
		Conta c2 = new Conta();
		c2.nome = "joao";
		
		if (c1 == c2) {
			System.err.println("as contas sao iguais");
		}else {		
		System.err.println("as contas sao diferentes");		
		}
	}

}
