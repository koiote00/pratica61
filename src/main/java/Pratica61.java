
import java.util.Map;
import java.util.Set;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
        System.out.println("Olá, Java!");
        
        Jogador j1= new Jogador(1, "Filipe");
        Jogador j2= new Jogador(2, "Vitor");
        Jogador j3= new Jogador(3, "Isi");
        Jogador j4= new Jogador(4, "Thiago");
        Jogador j5= new Jogador(5, "Gabriel");
        Jogador j6= new Jogador(6, "Rodrigo");
        
        Time time1= new Time("Vasco");
        Time time2= new Time("Flamengo");
        
        time1.addJogador("atacante", j1);
        time1.addJogador("meia", j2);
        time1.addJogador("zagueiro", j3);
        
        time2.addJogador("zagueiro", j4);
        time2.addJogador("atacante", j5);
        time2.addJogador("meia", j6);
        
         System.out.println(" Escalação: ");
         
        
        System.out.println("");
        time1.gettime(time2);
        
        
    }
}
