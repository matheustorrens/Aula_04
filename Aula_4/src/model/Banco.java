package model;

public class Banco {
	private String nome_banco;
	private String certificado_autorizacao;
	
	
	// Retornar as funções
	public String getNomeBanco()  {
		return nome_banco;	
	}
	public String getCertificadoAutorizacao()  {
		return certificado_autorizacao;
	}
	
	
	// Alterar as funções
	public void setNomeBanco(String Nome) {
		this.nome_banco = Nome;
	}
	public void setCertificadoAutorizacao(String Certificado) {
		this.certificado_autorizacao = Certificado;
	}
}
