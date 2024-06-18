public class ReprodutorMusical {
	
	private Boolean estaTocando;
	
	public void tocar() {
		if(!estaTocando) {
			System.out.println("Tocando musica.");
			estaTocando = true;
		} else {
			System.out.println("Musica ja esta sendo reproduzida");
		}
	}
	
	public void pausar(){
		if(estaTocando) {
			System.out.println("Musica pausada.");
			estaTocando = false;
		} else {
			System.out.println("Nao ha musica sendo reproduzida");
		}
	}
	
	public static String selecionarMusica(String musica) {
		return musica; 
	}
}
