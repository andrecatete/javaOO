package aula00;

//Instanciacao de uma classe
public class UsaProduto {
	public static void main(String[] args) {
		Produto A, B, C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
				
		System.err.println(A.codigo + " " + A.nome + " ");
		System.err.println(A.quantidade + " " + A.preco);
		
		A.codigo = 10;
		A.nome = "Sabonete";
		A.quantidade = 5;
		A.preco = 0.54;
		
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		
		B.codigo = 11;
		B.nome = "Detergente";
		B.quantidade = 35;
		B.preco = 1.25;
		
		System.err.println(B.codigo + " " + B.nome + " ");
		System.err.println(B.quantidade + " " + B.preco);
		
		C.codigo = 12;
		C.nome = "Shampoo";
		C.quantidade = 3;
		C.preco = 3.65;
		
		System.out.println(C.codigo + " " + C.nome + " ");
		System.out.println(C.quantidade + " " + C.preco);
		
		A.mostraPreco();
		A.atualizaPreco(12);
		A.mostraPreco();
	}
}
