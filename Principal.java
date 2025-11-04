package app;

import modelo.Pessoa;
import modelo.Sexo;

public class Principal {
    private static Pessoa[] pessoa;

	public static void main(String[] args) {
    	
    	
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setCpf("123.456.789-00");
        p1.setSexo(Sexo.MASCULINO);
        

        Pessoa p2 = new Pessoa();
        p2.setNome("Ana");
        p2.setCpf("653.476.342-08");
        p2.setSexo(Sexo.FEMININO);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Amanda");
        p3.setCpf("833.397.618-05");
        p3.setSexo(Sexo.FEMININO);
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Ana");
        p4.setCpf("723.440.721-07");
        p4.setSexo(Sexo.FEMININO);

        
        
        impressao(p1);
        System.out.println();
        impressao(p2);
        System.out.println();
        impressao(p3);
        System.out.println();
        impressao(p4);
        System.out.println();
        System.out.println();
        System.out.println();

        
        }
    

    public static void impressao(Pessoa pessoa) {
        pessoa.imprimir();
    }

  
}

