public class Contatto implements Cloneable{
    private String nome;
    private String cognome;
    private String cell;
    
    Contatto(){
        nome = "";
        cognome = "";
        cell = "";
    }
    
    Contatto(String nome, String cognome, String cell){
        setNome(nome);
        setCognome(cognome);
        setCell(cell);
    }
    
    Contatto(Contatto contatto){
        nome = contatto.getNome();
        cognome = contatto.getCognome();
        cell = contatto.getCell();
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    void setCell(String cell){
        this.cell = cell;
    }
    
    String getNome(){
        return nome;
    }
    
    String getCognome(){
        return cognome;
    }
    
    String getCell(){
        return cell;
    }
    
    public String toString(){
        return "nome: "+ nome +"\ncognome: "+ cognome +"\nnumero di telefono: "+ cell;
    }
    
    public boolean equals(Contatto contatto){
        return nome.equals(contatto.getNome()) && cognome.equals(contatto.getCognome()) && cell.equals(contatto.getCell());
    }
    
    public Contatto clone() throws CloneNotSupportedException{
        Contatto contatto = null;
        contatto = (Contatto)super.clone();
        return contatto;
    }
}
