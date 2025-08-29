package br.com.senaisp.bauru.lara.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.senaisp.bauru.lara.classes.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		try {
			Produto prd = Produto.create("Produto xpto",5.0,12.20);
			System.out.println("Porduto " + prd.getId());
			//listando os produtos
			List<Produto> lista = Produto.listarProdutos();
			for (Produto prod: lista) {
				System.out.println(prod.getDescricao() + " - " + prod.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
