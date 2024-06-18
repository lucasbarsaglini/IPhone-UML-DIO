
public class NavegadorInternet {

	private Boolean navegadorAberto;
	private Boolean paginaAberta;
	
	public void adicionarNovaAba() {
		if(navegadorAberto) {
			System.out.println("Aba adicionada.");
		} else {
			System.out.println("Navegador fechado.");
		}
	}
	
	public void atualizarPagina() {
		if(paginaAberta) {
			System.out.println("Pagina atualizada.");
			paginaAberta = false;	
		} else {
			System.out.println("Nenhuma pagina aberta.");
		}
	} 
	
	public static String exibirPagina(String url) {
		return url;
	}
}
