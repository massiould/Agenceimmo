import java.util.Date;

abstract class Personne {
	
	
	private String nom;
	private String adressePersonne;
	private String mail;
	private int numeroDeTelephone;
	 
    public Personne (String mail ,int numeroDeTelephone ,String nom , String adressePersonne){
    }
    	 public String getnom(){
  		   return this.nom;
  		   }
  		 public String getadressePersonne(){
  		   return this.adressePersonne;
  		   }
  		 
  		 public String getmail(){
  		   return this.mail;
  		 }
  		public int getnumeroDeTelephone(){
   		   return this.numeroDeTelephone;
   		 }
     
    
    


}
