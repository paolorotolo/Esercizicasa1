import java.util.ArrayList;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		 Scanner inserimento = new Scanner(System.in);

	        // Crea un vettore vuoto di impiegati che chiameremo "lista Impiegati"
	        ArrayList<Impiegato> listaImpiegati = new ArrayList<>();
	       
	        // Crea il manager
	        Manager UnicoManager= null;


	        for (int i=0; i<3; i++){
	            // Chiediamo i vari parametri
	            System.out.println("Inserisci nome:");
	            String nome = inserimento.next();

	            System.out.println("Inserisci ID:");
	            int id = inserimento.nextInt();

	            System.out.println("Inserisci anni:");
	            int anni = inserimento.nextInt();

	            
	            if (i==1){
					
					System.out.println("Inserisci nome segretaria:");
		            String nomes = inserimento.next();
					 UnicoManager= new Manager(nome,id,anni,nomes);
                 }
	            else {
	            	// Creiamo per ogni ciclo 1 nuovo impiegato
		            // Passiamo nel costruttore il nome che abbiamo appena acquisito, l'id e gli anni
		            Impiegato impiegato = new Impiegato(nome, id, anni);
		         // Infine aggiungiamo l'impiegato appena creato al vettore di impiegati
		            listaImpiegati.add(impiegato);
          
                     }
	        }
		for(int i = 0; i<listaImpiegati.size(); i++)
		{
		
			listaImpiegati.get(i).stampainfoimpiegato();
		}
		
	    
		System.out.println("tale impiegato è anche manager");
		//listaImpiegati.get(1).stampainfoimpiegato();
	     UnicoManager.stampainfomanager();
		
	
		
			
		
	
		
		
		
		
		
	}
		
	}
