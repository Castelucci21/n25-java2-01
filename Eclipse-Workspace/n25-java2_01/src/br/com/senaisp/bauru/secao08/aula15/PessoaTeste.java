package br.com.senaisp.bauru.secao08.aula15;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pe01 = new PessoaFisica();
		Pessoa pe02 = new PessoaJuridica();
		pe01.setNome("Roberval da Silva");
		try {
			pe01.setEndereco("Rua das Ruas, 1234");
		} catch (EnderecoException e) {
			System.out.println("Endereço não pode ser nulo");
			e.printStackTrace();
		}
		try {
			pe01.setDocumento("123.456.789-09");
		} catch (DocumentException e) {
			System.out.println("Documento inválido");
			
			e.printStackTrace();
		}
		pe01.setDataNascimento("20/05/1999");

		pe02.setNome("Roberval da Silva 2");
		try {
			pe02.setEndereco("Rua das Ruas, 12345");
		} catch (EnderecoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pe02.setDocumento("12345678910");
		} catch (DocumentException e) {
			System.out.println("Documento inválido");
			e.printStackTrace();
		}
		pe02.setDataNascimento("20/05/1990");
		
		System.out.println(pe01);
		System.out.println(pe02);
	}

}

