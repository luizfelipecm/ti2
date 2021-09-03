package maven.ex02;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Carro carro = new Carro(11, "preto", "flex",'M');
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		//Mostrar carros manuais		
		System.out.println("====Mostrar carros manuais=== ");
		Carro[] carros = dao.getCarrosManuais();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carros
		carro.setCaracteristicas("nova caracteristica");
		dao.atualizarCarro(carro);
		
		//Excluir carro
		dao.excluirCarro(carro.getCodigo());
		
		//Mostrar carros
		carros = dao.getCarros();
		System.out.println("==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}