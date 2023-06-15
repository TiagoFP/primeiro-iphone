package ios;

import ios.Iphone.Iphone;
import ios.ipod.Ipod;
import ios.safari.Safari;
import ios.telefone.Telefone;


public class SistemaIos {
	
	public static void main(final String[] args) {
		Iphone operacao = new Iphone();
		Ipod ipod = operacao;
		Safari safari = operacao;
		Telefone telefone = operacao;

		operacao.VerificarBateria();
		operacao.LigarIphone();
		operacao.VerificarConexao();
		operacao.tocar();
		operacao.pausar();
		operacao.selecionarFaixa();
		operacao.exibirPagina();
		operacao.adicionarNovaAba();
		operacao.atualizarPagina();
		operacao.ligar();
		operacao.atender();
		operacao.iniciarCorreioVoz();

	}

	
	
}
