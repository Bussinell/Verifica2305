import java.util.*;
class ContattoInesistente extends Exception{
    
}
public class Rubrica implements Cloneable{
    LinkedList<Contatto>rubrica;

    public Rubrica(){
        rubrica = new LinkedList<Contatto>();
    }
    
    public void aggiungiContatto(Contatto contatto) throws CloneNotSupportedException {
        rubrica.add(contatto.clone());
    }
    
    public void rimuoviContatto(Contatto contatto){
        rubrica.remove(contatto.getNome());
    }
    
    public String cercaContatto(String nome, String cognome) throws ContattoInesistente{
        Iterator<Contatto>i;
        for (i = rubrica.iterator(); i.hasNext();){
            Contatto contatto = i.next();
            if (contatto.getNome().equals(nome) && contatto.getCognome().equals(cognome)){
                return contatto.getCell();
            }
        }
        throw new ContattoInesistente();
    }
    
    public static void main(String[] args) throws ContattoInesistente, CloneNotSupportedException {
        Rubrica rubrica = new Rubrica();
        
        Contatto c1 = new Contatto("Francesco", "Bussi", "12345678");
        Contatto c2 = new Contatto("Mario", "Rossi", "76358762");
        Contatto c3 = new Contatto("Sofia", "Danzi", "34224543");
        Contatto c4 = new Contatto();
        rubrica.aggiungiContatto(c1);
        rubrica.aggiungiContatto(c2);
        rubrica.aggiungiContatto(c3);
        
        System.out.println("ricerca di un contatto: "+ rubrica.cercaContatto("Francesco", "Bussi"));
        
        rubrica.rimuoviContatto(c2);
    }
}
