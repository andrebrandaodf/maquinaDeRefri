package maquinaDeRefri;

public class MaquinaRefrigerante {

	
		private Refrigerante lista[];
		private float        credito;
		
		public MaquinaRefrigerante() {
			lista = new Refrigerante[5];
			lista[0] = new Refrigerante("Coca-Cola ", 2.80f, 5);
			lista[1] = new Refrigerante("Sprite ", 2.5f, 5);
			lista[2] = new Refrigerante("Fanta ", 2.0f, 5);
			lista[3] = new Refrigerante("Sprite ", 1.80f, 5);
			lista[4] = new Refrigerante("Kuat ", 1.50f, 5);
		}
		
		public void inserirCredito(float valor) {
			this.credito += valor;
		}
		
		public float solicitarTroco() {
			float troco = this.credito;
			this.credito = 0.0f;
			return troco;
		}
		
		//Retorna: 0: Sucesso -1: Sem crédito -2: Sem estoque
		public int comprar(int numRefri) {
			if(this.credito >= lista[numRefri].getPreco()) {
				if(lista[numRefri].getQtde() > 0) {
					this.credito -= lista[numRefri].getPreco();
					int novaQtde = lista[numRefri].getQtde() -1;
					lista[numRefri].setQtde(novaQtde);
					return 0;
				}
				else {
					return -2;
				}
			}
			else {
				return -1;
		}

	}

		public String mostraInfo() {
			String str = "";
			str += "+======================================+\n"  +
				   "|      Máquina de Refrigerante.         \n"  +
				   "+---------------------------------------\n"  +
				   "| Crédito: R$ "+this.credito +         "\n";
			for(Refrigerante r: lista) {
				str += "| "+r.getNome() + " R$ "+r.getPreco()+"\n";
			}
			str += "+======================================+\n";
			return str;
		}
}

	

