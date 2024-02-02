import java.util.IdentityHashMap;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int id ;
        float moy ;
        String nom ;
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        nom = scanner.next() ;
        moy = scanner.nextFloat();

        Etudiant e1=new Etudiant(id,nom,moy);

        Etudiant e2=new Etudiant(12,"Mouadh",19.99F);
        Ingenieur g1 = new Ingenieur(13, "Ahmed", 14.67f, "teelcom", "ooredoo");
        Ingenieur g2 = new Ingenieur(14, "mohamed", 13.56f, "telecom", "orange");
        eLMD l1 = new eLMD(15,"Feres",12.33f,"Projet projet electronique");


          Etudiant[] t =new Etudiant[5];
            t[0]=e1;
            t[1]=e2;
            t[2]=g1;
            t[3]=g2;
            t[4]=l1;
            for(int i=0 ;i<5 ; i++ ){
                System.out.println(t[i].toString() );



        }
}
}
//Convertir nombre en chaine de caractere String.valueOf(ce veut convertir)
//utiliser scanner pour saisir au clavier dans main int id; String nom; double moyenne; scanner scan =new scanner(system in) variable.scan.nexttype