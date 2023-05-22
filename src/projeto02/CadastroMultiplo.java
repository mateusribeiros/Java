package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_02;

public class CadastroMultiplo {
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[5];
		
		cliente[0] = new Cliente("A");
		cliente[0].setIdade(0);
		cliente[0].setTelefone("000-0000");
		
		cliente[1] = new Cliente("B");
		cliente[1].setIdade(1);
		cliente[1].setTelefone("111-1111");
		
		cliente[2] = new Cliente("C");
		cliente[2].setIdade(2);
		cliente[2].setTelefone("222-2222");
		
		cliente[3] = new Cliente("D");
		cliente[3].setIdade(3);
		cliente[3].setTelefone("333-3333");

        cliente[4] = new Cliente("E");
        cliente[4].setIdade(4);
        cliente[4].setTelefone("444-4444");

		for (int i=0;i<cliente.length;i++) {
			System.out.println(cliente[i]);
			
		}

    }
}
