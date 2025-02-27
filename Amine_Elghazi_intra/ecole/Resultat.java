package ecole;


public class Resultat {
    private String codeCours;
    private String note;


    public Resultat(String codeCours, String note) {
        this.codeCours = codeCours;
        this.note = note;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
