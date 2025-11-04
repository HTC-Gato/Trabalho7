package modelo;

public class Pessoa {

	    private String nome;
	    private String cpf;
	    private Sexo sexo;

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public void setSexo(Sexo sexo) {
	        this.sexo = sexo;
	    }

	    public void imprimir() {
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + cpf);
	        System.out.println("Sexo: " + sexo);
	    }

		public Sexo getSexo() {
			// TODO Auto-generated method stub
			return null;
		}

	
		}
	
