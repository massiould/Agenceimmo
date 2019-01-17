

abstract class Personne {
	
	
	private String nom;
	private String adressePersonne;
	private String mail;
	private int numeroDeTelephone;
	public Voeux voeux;
	 
    public Personne (String mail ,int numeroDeTelephone ,String nom , String adressePersonne , Voeux voeux){
    }
    	 public String getnom(){
  		   return this.nom;
  		   }
    	 public Voeux getVoeux() {
    		 
    	 return this.voeux;
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
