package br.com.senaisp.bauru.lara.teste;

import java.sql.SQLException;

import br.com.senaisp.bauru.lara.classes.ConectorBancoDados;

public class ConectorBancoDadosTeste {

	public static void main(String[] args) throws SQLException {
		ConectorBancoDados conn = ConectorBancoDados.getInstancia();
		System.out.println(conn.getConnStr());	
		
		ConectorBancoDados conn2 = ConectorBancoDados.getInstancia();
		System.out.println(conn2.getConnStr());	
		
		System.out.println(conn);	
		System.out.println(conn2);
	}

}
