import java.util.Date ;
public class BienImmobilier {

		
		private String adresse ;
	    private String orientation;
	    private int prix;
	    private Date dateVente ;
	    private Date dateDeDisponibilite;
	    private int numeroBienImmobilier;
	    
	    public BienImmobilier (String adresse , String orientation , int prix , Date dateVente ,Date dateDeDisponibilite ,int numeroBienImmobilier){
	     this.adresse = adresse;
	     this.orientation = orientation ;
	     this.prix =prix ;
	     this.dateVente =dateVente;
	     this.dateDeDisponibilite=dateDeDisponibilite;
	     this.numeroBienImmobilier=numeroBienImmobilier;
	    }
	    	
	   public String getAdresse(){
		   return this.adresse;
	   }
	   public String getOrientation(){
		   return this.orientation;
	   }
	   public int getPrix(){
		   return this.prix;
	   }
	   public Date getDateVente(){
		   return this.dateVente;
	   }
	   public Date getDateDeDisponibilite(){
		   return this.dateDeDisponibilite;
	   }
	   public int getnumeroBienImmobilier(){
		   return this.numeroBienImmobilier;
	   }
	    

	}



