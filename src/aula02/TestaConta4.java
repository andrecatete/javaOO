package aula02;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.limite =100;
		
		Conta c2;
		c2=c1;
		
		System.err.println(c1.limite);
		
		System.err.println(c2.limite);
		

	}

}
