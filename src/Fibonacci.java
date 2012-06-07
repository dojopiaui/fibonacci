
public class Fibonacci {
	public long elemento(int n){
		long retorno = 0;
		long atual = 0;
		long anterior = 1;
		for (int i = 1; i < n; i++) {
			long aux = atual;
			atual = atual + anterior;
			anterior = aux;
		}
		retorno = atual;
		
		return retorno;
		
	}
	
	public void escreve(int n) {
		for (int i=1; i <=n; i++) {
			System.out.print(elemento(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.escreve(Integer.parseInt(args[0]));
	}
	
}
