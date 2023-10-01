package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente jonathan = new Cliente();
		
		jonathan.setNome("Jonathan Almeida");
		
		jonathan.setCpf("222.222.222-22");
		
		jonathan.setProfissao("Estudante");
		
		Conta contaDoJow = new Conta(669, 6792722);
		
		
		contaDoJow.deposito(100);
		//Associa cliente Jonathan para conta Do Jonathan
		contaDoJow.setTitular(jonathan);
		System.out.println(contaDoJow.getTitular().getNome());
		
		contaDoJow.getTitular().setProfissao("Programador");
		
	}
}
