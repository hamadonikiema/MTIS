package mtis;

import javax.swing.JOptionPane;

public class Client {
//1.Définir une classe Client avec les attributs suivants : CIN, Nom, Prénom, Tél.
	private String cni,nom,prenom,tel;
	
//2.Définir à l’aide des propriétés les méthodes d’accès aux différents attributs de la classe.

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
//3.Définir un constructeur permettant d’initialiser tous les attributs.
	// Nous allons construire plus tard un constructeur sans argument pour rendre possible l'exécution du programme

	public Client(String cni, String nom, String prenom, String tel) {
		super();
		this.cni = cni;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}
//4.Définir un constructeur permettant d’initialiser le CIN, le nom et le prénom.

public Client() {
		super();
	}

public Client(String cni, String nom, String prenom) {
	super();
	this.cni = cni;
	this.nom = nom;
	this.prenom = prenom;
}
//5.Définir la méthode Afficher permettant d’afficher les informations du Client en cours.
 
// A ce niveau nous allons d'abord créer la méthode toString pour récupérer et afficher les informations.
// Et ensuite une méthode saisie pour permettre au client d'entrer ses informations.
@Override
public String toString() {
	return "Client [cni=" + cni + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + "]";
}

public void Saisiegraphique()
{
	JOptionPane.showMessageDialog(null, "Saisie des informations du client");
	cni = JOptionPane.showInputDialog("Entrer le numéro de votre CNI :");
	nom = JOptionPane.showInputDialog("Entrez votre nom: ");
	prenom = JOptionPane.showInputDialog("Entrer votre prénom: ");
	tel = JOptionPane.showInputDialog("Entrer votre numéro de téléphone: ");
}
public void Affichagegraphique()
{
	JOptionPane.showMessageDialog(null, "Le numéro de CNI du client est "+cni);
	JOptionPane.showMessageDialog(null, "Le nom du client est "+nom);
	JOptionPane.showMessageDialog(null, "Le prénom du client est "+prenom);
	JOptionPane.showMessageDialog(null, "Le numéro de téléphone du client est "+tel);
	
	
}
}
