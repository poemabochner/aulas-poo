package br.org.serratec.generico;
//
public class MeuGenerico <T>{
	
		private T valor;

		public MeuGenerico(T valor) {
			super();
			this.valor = valor;
		}

		@Override
		public String toString() {
			return "valor: " + valor;
		}

		public T getValor() {
			return valor;
		}
}
