
public class Impiegato {
	// dati
	public String Nome;
    public int ID;
    public int Annidiservizio;
    
    //Costruttore
    public Impiegato( String n, int id , int as )
    {
    	this.Nome=n;
    	this.ID=id;
    	this.Annidiservizio=as;
    	
    }
    public void stampainfoimpiegato()
    {
    	System.out.println("Nome impiegato "+ Nome +" Id impiegato: "+ ID+ "; impiegato in servizio da " + Annidiservizio + "anni");
    }

}
