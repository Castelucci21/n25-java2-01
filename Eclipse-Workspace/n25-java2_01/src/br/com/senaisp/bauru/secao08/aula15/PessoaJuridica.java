package br.com.senaisp.bauru.secao08.aula15;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica() {
		super(); //usando o constructor da classe pai
		setTipoPessoa('J');
	}
	//Constructor com 
	public PessoaJuridica(String nom, String doc, String ende, String dtNas) throws Exception {
		super(nom,doc,ende,dtNas);
		setTipoPessoa('J'); //Usando o constructor da classe pai
	}
	@Override
	protected boolean isDocumentoValido(String documento2) {

		return documento2.length()==14 || documento2.length()==18;
	}

}
