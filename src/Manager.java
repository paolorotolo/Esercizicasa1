
public class Manager extends Impiegato {

	//dati oltre quello di Impiegato
	public String NomeSegretaria;
	//costruttore della classe derivata
	public Manager(String n, int id , int as, String ns)
	{
	super(n, id, as);
	this.NomeSegretaria=ns;
	}
	
	public void stampainfomanager(){
	super.stampainfoimpiegato();
	System.out.println("Nome segretaria: "+ NomeSegretaria);
	}
	}
