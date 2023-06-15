package ios.Iphone;

import ios.ipod.Ipod;
import ios.safari.Safari;
import ios.telefone.Telefone;


public class Iphone implements Ipod, Safari, Telefone {
	public void VerificarBateria() {
		System.out.println("Verificando Bateria");
	}


	public void LigarIphone() {
		System.out.println("Ligando Iphone");
	}
	

	public void VerificarConexao() {
		System.out.println("Verificando Conexão com Internet");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando faixa via Iphone");	
		
	}

	@Override
	public void selecionarFaixa() {
		System.out.println("Selecionando faixa via Iphone");
		
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando faixa via Iphone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba via Iphone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina via Iphone");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo nova pagina via Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada via Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via Iphone");
		
	}

	@Override
	public void ligar() {
		System.out.println("Iniciando chamada via Iphone");
		
	}

	
}




