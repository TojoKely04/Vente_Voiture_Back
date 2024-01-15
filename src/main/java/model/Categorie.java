@Entity
public class Categorie{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idCategorie ; 
	String nom ; 

	public Categorie(){}

	public Categorie(Long idCategorie , String nom){
		this.idCategorie= idCategorie ; 
		this.= nom; 
	}

	@Override
	public String toString(){
		return "Categorie { " +
		"idCategorie= "+idCategorie+ 
		" nom = " +nom+ '}';
	}

	public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}