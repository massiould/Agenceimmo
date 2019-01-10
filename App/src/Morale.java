
public class Morale extends Personne {
	private long numeroSiren;
	private String formeJuridique;
	public Morale(String mail, int numeroDeTelephone, String nom, String adressePersonne) {
		super(mail, numeroDeTelephone, nom, adressePersonne);
		this.formeJuridique=formeJuridique;
		this.numeroSiren=numeroSiren;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getformeJuridique(){
		   return this.formeJuridique;
		 }

	
	public long numeroSiren(){
		   return this.numeroSiren;
		 }
}
