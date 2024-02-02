import java.security.PublicKey;

public class Etudiant {
   private int id;
    private String nom;
    private float moy;
    public Etudiant(int id, String nom, float moy){
        this.id=id;
        this.nom=nom;
        this.moy=moy;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
}
    public double getMoyenne(){

        return moy;
    }
    public void setMoyenne(float moy){

        this.moy=moy;
    }
    public String toString(){
        return String.valueOf(this.id)+"-"+ this.nom+"-"+String.valueOf(this.moy);
    }

 }
