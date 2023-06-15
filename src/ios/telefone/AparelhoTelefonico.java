package ios.telefone;
public class AparelhoTelefonico implements Telefone {
	public void ligar() {
		System.out.println("Iniciando chamada");
	}

	public void atender() {
		System.out.println("Atendendo chamada");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
