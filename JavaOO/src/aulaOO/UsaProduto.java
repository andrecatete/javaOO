package aulaOO;

public class UsaProduto {

	public static void main(String[] args) {
		Produto A, B, C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
		
		System.out.println(A.codigo + "|" + A.nome + "|" +A.quantidade+ "|"+ A.preco);
		
		A.codigo = 10;
		A.nome = "camiseta";
		A.quantidade = 5;
		A.preco = 30.0;
		System.out.println(A.codigo + "|" + A.nome + "|" +A.quantidade+ "|"+ A.preco);
		

	}

}
