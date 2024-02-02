public class Ingenieur extends Etudiant {
    String stage1, stage2;

    public Ingenieur (int id, String nom, float moy, String stage1, String stage2) {
        super(id, nom, moy);
        this.stage1 = stage1;
        this.stage2 = stage2;
    }
        public String toString(){
        return super.toString()+ "-" + stage1 + "-" + stage2 ;



}
}


