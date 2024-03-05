package app;

import view.Mensagens;
import model.Banco;
import model.Usuario;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensagens mensagem = new Mensagens();
		
		String Nome, CPF, Celular, Email, Senha;
		String opcao;
		int opcaoNum;
		
		do {
			opcao = mensagem.solicitarEntrada("Sistema Bancário"
									   + "\nDigite a opção deejada"
									   + "\n[1]. Cadastrar Banco"
									   + "\n[2]. Cadastrar Usuario"
									   + "\n[3]. Sair"
									   );
			opcaoNum = Integer.parseInt(opcao);
			
			switch(opcaoNum) {
				case 1:
					String nomeBanco;
					String nomeCertificado;
					
					nomeBanco = mensagem.solicitarEntrada("Digite o nome do banco: ");
					Banco novoBanco = new Banco(nomeBanco);
					mensagem.mostrarMensagemDeSucesso("Banco cadastrado!"
													+ novoBanco.getBanco());
					break;
					
				case 2:
					Nome = mensagem.solicitarEntrada("Digite seu NOME: ");
					CPF = mensagem.solicitarEntrada("Digite seu CPF: ");
					Celular = mensagem.solicitarEntrada("Digite seu CELULAR: ");
					Email = mensagem.solicitarEntrada("Digite seu EMAIL: ");
					Senha = mensagem.solicitarEntrada("Digite seu SENHA: ");
					Usuario usuario = new Usuario(Nome, CPF, Celular, Email, Senha);
					mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
					break;
					
				case 3:
					System.exit(opcaoNum);
					break;
					
			}
		}while(opcaoNum == 3);
		
		
	}

}
