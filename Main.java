import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Calendar.PM;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<classEmployee> ArrayEmpolye = new ArrayList<>();

    public static void main (String[] args) {

        classmenu.menu();
        int choix = sc.nextInt();

        while (choix < 1 || choix > 9) {
            classmenu.menu();
            choix = sc.nextInt();
        }
        while (choix >= 1 && choix <= 9) {
            switch (choix) {

                case 1:
                    ajouterEmploye();
                    classmenu.menu();
                    choix = sc.nextInt();
                    break;
                case 2:
                    modifierEmploye();
                    choix = sc.nextInt();
                    break;
                case 3:
                    Supprimer();
                    choix = sc.nextInt();
                    break;

                case 4:
                    afficheunEmploye();
                    choix = sc.nextInt();
                    break;

                case 5:
                    affichertouslesEmploye();
                    choix = sc.nextInt();
                    break;

                case 6:
                    Affichersalaire();
                    choix = sc.nextInt();
                    break;
                case 7:
                    plusage();
                    choix = sc.nextInt();
                    break;
                case 8:
                    moinsage();
                    choix = sc.nextInt();
                    break;

                case 9:
                    System.out.println("AU REVOIR");
                    quitter();
                    break;

            }
        }
    }
//    AjouterEmployee
    static void ajouterEmploye () {

        System.out.print("Entrer le matricule :");
        int Matricule = sc.nextInt();
        System.out.print("Entrer le nom :");
        String Nom = sc.next();
        System.out.print("Enter le prenom :");
        String Prenom = sc.next();
        System.out.print("Entrer l'age :");
        int Age = sc.nextInt();
        System.out.print("Entre le salaire :");
        double Salaire = sc.nextDouble();
        classEmployee e = new classEmployee(Matricule, Nom, Prenom, Age, Salaire);
        ArrayEmpolye.add(e);


    }
//    modifier employe
    static void modifierEmploye(){
        System.out.print("Entrer le matricule d'employe pour le modifier :");
        int Matricule=sc.nextInt();
        boolean exist=false;
        int i=0;
        int ind = 0;
        for (classEmployee e : ArrayEmpolye){
            ++i;
            if (e.getMatricule()==Matricule){
                exist=true;
                ind=i;
            }
        }
        if (exist){
            System.out.println("Modification :");
            System.out.print("Entrer le matricule :");
            Matricule=sc.nextInt();
            System.out.print("Entrer le nom :");
            String Nom=sc.next();
            System.out.print("Enter le prenom :");
            String Prenom=sc.next();
            System.out.print("Entrer l'age :");
            int Age=sc.nextInt();
            System.out.print("Entre le salaire :");
            double Salaire=sc.nextDouble();
            classEmployee e = new classEmployee(Matricule,Nom,Prenom,Age,Salaire);
            ArrayEmpolye.set(ind,e);

        }
        else {
            System.out.println("Cet employe indisponible !");

        }
    }
//    supprimer un employee
    static void Supprimer() {
        if (ArrayEmpolye.isEmpty()) {
            System.out.print("la base de donner est vide ");
        } else {
            System.out.print("donner le matricule de l'employer suprimer : ");
            int Matricule = sc.nextInt();

            for (int i = 0; i < ArrayEmpolye.size(); i++) {
                if (Matricule == ArrayEmpolye.get(i).getMatricule()) {
                    ArrayEmpolye.remove(i);
                    System.out.print("la supression d'employe fait avec succes");
                    System.out.print("\n");
                }else{
                    System.out.print("se matricule ne trouve pas ");
                    System.out.print("\n");
                }
            }
        }
    }
    //  afficher un employe
    static void afficheunEmploye () {

        if (ArrayEmpolye.isEmpty()) {
            System.out.println("Il n'y a aucun employe !");
        } else {
            System.out.print("Entrer le matricule d'employe pour l'afficher :");
            int Matricule = sc.nextInt();
            for (classEmployee e:ArrayEmpolye) {
                if (e.getMatricule() == Matricule) {
                    System.out.println(e);
                } else {

                    System.out.println("Cet employe n'extste pas !");
                }
            }
        }
    }
//Afficher tous les employes
    static void affichertouslesEmploye () {
        System.out.print("Entrer  d'employé pour affiché :");
        int Matricule = sc.nextInt();
        int i = 0;
        for (classEmployee e : ArrayEmpolye) {
            i++;
            if (e.getMatricule() == Matricule) {
                System.out.println("les information de employé de  matricule" + e.getMatricule() +'\n'+ "      - nom        = " + e.getNom() + '\n' + "      - prenom     = " + e.getPrenom() + '\n' + "      - age        = " + e.getAge() +'\n' + "      - salaire    = " + e.getSalaire() +'\n');
            } else {
                System.out.println("le employé indisponible ");
            }
        }
    }





//Afficher le salaire plus de 10000
    static void Affichersalaire() {
        int nb = 0;
        if (ArrayEmpolye.isEmpty()) {
            System.out.print("la base de donner est vide \n");

        } else {

            for (int i = 0; i < ArrayEmpolye.size(); i++) {
                if (ArrayEmpolye.get(i).getSalaire() > 10000) {
                    nb += 1;
                }
            }
            System.out.println("le nombre des employés ayant un salaire qui dépasse 10000 est : " + nb + "\n");

        }
    }



//    employee plus age
    static  void plusage(){
        int nb = 0;
        if (ArrayEmpolye.isEmpty()) {
            System.out.print("la base de donner est vide \n");

        } else {

            for (int i = 0; i < ArrayEmpolye.size(); i++) {
                if (ArrayEmpolye.get(i).getAge() > 25) {
                    nb += 1;
                }
            }
            System.out.println("les employés les plus âgé sont:" + nb + "\n");
        }


    }
//    employee moins age
    static  void moinsage(){
        int nb = 0;
        if (ArrayEmpolye.isEmpty()) {
            System.out.print("la base de donner est vide \n");

        } else {

            for (int i = 0; i < ArrayEmpolye.size(); i++) {
                if (ArrayEmpolye.get(i).getAge() < 25) {
                    nb += 1;
                }
            }
            System.out.println("les employés les moins âgé sont:" + nb + "\n");
        }


    }
//    Quitter
    static void quitter(){
        classmenu.menu();
        int choix = sc.nextInt();

    }



}