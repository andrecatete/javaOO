package aula00;

//Instanciacao de uma classe
public class UsaProduto2 {
	public static void main(String[] args) {
		Produto2 A, B, C;
		A = new Produto2();
		B = new Produto2();
		C = new Produto2();
				
		A.codigo = 1;
		System.out.println("Valor do codigo em A: " + A.codigo);
		System.out.println("Valor do codigo em B: " + B.codigo);
		
		B.codigo = 2;
		System.out.println("Valor do codigo em A: " + A.codigo);
		System.out.println("Valor do codigo em B: " + B.codigo);
		System.out.println("Valor do codigo em C: " + C.codigo);
		
	}
}
