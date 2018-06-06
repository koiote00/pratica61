
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filipe
 */
public class Time {
    private  String nome;
    private   HashMap<String, Jogador> jogadores = new HashMap<>();;
    

    public Time(String nome) {
        this.nome=nome;
       
}
    public void addJogador(String posicao, Jogador j) {
		jogadores.put(posicao, j );
               	
	}
    public  Jogador getjogador(String chave){
        return jogadores.get(chave);      
    }
    
    public void gettime(Time x){
        Set<Map.Entry<String, Jogador>> time = jogadores.entrySet();
        
    for (Map.Entry<String, Jogador> entry: time) {   
      
        System.out.print(entry.getKey() + " : " + entry.getValue() + "  "   );
        System.out.println(x.getjogador(entry.getKey()));
        System.out.println("");
    }
    }

    Set<Map.Entry<String, Jogador>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}