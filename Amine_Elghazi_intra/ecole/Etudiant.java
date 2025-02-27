package ecole;

public class Etudiant {
    private String nom;
    private String prenom;
    private float resultats = 0;
    private int nbrResultats;
    private float meilleureNote;
    private float pireNote;
    private float moyenne;
    private byte nbrCours;

    public Etudiant() {
        Etudiant[] tableau = new Etudiant[5];
    }

    public Etudiant(String nom, String prenom, int nbrCours) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbrCours = 0;

    }

    public void ajouterResultat(float resultats) {
    }

    public void modifierResultat(String codeCours, float resultats) {

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

    public float getMeilleureNote() {
        return meilleureNote;
    }

    public float getPireNote() {
        return pireNote;
    }

    public void calculerMoyenne() {
    }

    public String showStudentInfo() {
        return "|Nom : " + nom + "|Prénom : " + prenom + "\t" + "|Nombre de cours :  " + nbrCours + "\t|Moyenne : " + moyenne;
    }
}
