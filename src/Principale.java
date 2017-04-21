import java.util.ArrayList;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		 Scanner inserimento = new Scanner(System.in);

	        // Crea un vettore vuoto di impiegati che chiameremo "lista Impiegati"
	        ArrayList<Impiegato> listaImpiegati = new ArrayList<>();
	       
	        // Crea il manager
	      ArrayList<Manager> listaManager = new ArrayList<>();;

            
	        System.out.println("Quanti impiegati vuoi inserire?");
	        int N= inserimento.nextInt();
	        
	        for (int i=0; i<N; i++){
	            // Chiediamo i vari parametri
	            System.out.println("Inserisci nome:");
	            String nome = inserimento.next();

	            System.out.println("Inserisci ID:");
	            int id = inserimento.nextInt();

	            System.out.println("Inserisci anni:");
	            int anni = inserimento.nextInt();

	           
	                // Creiamo per ogni ciclo 1 nuovo impiegato
		          // Passiamo nel costruttore il nome che abbiamo appena acquisito, l'id e gli anni
		            Impiegato impiegato = new Impiegato(nome, id, anni);
		         // Infine aggiungiamo l'impiegato appena creato al vettore di impiegati
		            listaImpiegati.add(impiegato);
          
                    
	        }
	       
	        System.out.println("Quanti manager vuoi inserire?");
	        int M= inserimento.nextInt();
	        
	        for (int i=0; i<M; i++){
	        	 System.out.println("Inserisci nome:");
		            String nome = inserimento.next();

		            System.out.println("Inserisci ID:");
		            int id = inserimento.nextInt();

		            System.out.println("Inserisci anni:");
		            int anni = inserimento.nextInt();
	        	System.out.println("Inserisci nome segretaria:");
	            String nomes = inserimento.next();
	            
				 Manager UnManager= new Manager(nome,id,anni,nomes);
				 
				 listaManager.add(UnManager);
	        }
	        
		for(int i = 0; i<listaImpiegati.size(); i++)
		{
		
			listaImpiegati.get(i).stampainfoimpiegato();
		}
		
		for(int i = 0; i<listaManager.size(); i++)
		{
		
			listaManager.get(i).stampainfomanager();
		}
		
		
		

	
		
			
		
	
		
		
		
		
		
	}
		
	}
