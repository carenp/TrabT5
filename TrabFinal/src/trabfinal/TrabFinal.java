
package trabfinal;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;


public class TrabFinal {

    public String x;
    ArrayList<String> lista = new ArrayList<>();
    Aluno item = new Aluno(); //item é objeto de Aluno    
      
    public static void main(String[] args) {
        System.out.println("Digite a matricula do Aluno: ");         
        Scanner entrada = new Scanner(System.in); //usuario pode digitar entrada de dados
        //x = entrada.nextInt(); //x guarda a entrada digitada
        //item.setMatricula(x); //atualiza em Aluno a matricula
        //lista.add(item.getMatricula()); //pega a matricula de Aluno
        
        new telas.TelaAluno().setVisible(true);//faz aparecer a tela
    }
}
