package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		geraErro2();
		
		System.out.println("Fim");
	}
	
	
	//excecao NAO checada ou nao verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal 01");
	}
	
	//excecao checada ou verificada
	static void geraErro2(){
		try {
			throw new Exception("Ocorreu um erro bem legal 02");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Que legal");
		}
	}
}
