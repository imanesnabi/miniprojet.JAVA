public class classEmployee {

        private int Matricule;
        private static int count;
        private String Nom;
        private String Prenom;
        private int Age;
        private double Salaire;

        public classEmployee( String Nom, String Prenom, int Age, double Salaire) {
            this.Matricule = count++;
            this.Nom = Nom;
            this.Prenom = Prenom;
            this.Age = Age;
            this.Salaire = Salaire;
        }
        public classEmployee(){
            Matricule=count++;
            Nom="";
            Prenom="";
            Age=0;
            Salaire=0;

        }

        public int getMatricule() {
        return Matricule;
    }

        public void setMatricule(int matricule) {

            Matricule = matricule;
        }

        public String getNom() {

            return Nom;
        }

        public void setNom(String nom) {

            Nom = nom;
        }

        public String getPrenom() {

            return Prenom;
        }

        public void setPrenom(String prenom) {

            Prenom = prenom;
        }

        public int getAge() {

            return Age;
        }

        public void setAge(int age) {

            Age = age;
        }

        public double getSalaire() {

            return Salaire;
        }

        public void setSalaire(double salaire) {

            this.Salaire = salaire;
        }


        public String toString() {
            return
                            " - matricule  : " + Matricule +'\n'+
                            " - nom   : " + Nom + '\n' +
                            " - prenom   : " + Prenom + '\n' +
                            " - age   : " + Age +'\n' +
                            " - salaire  : " + this.Salaire +'\n';
        }

        public boolean equals(Object o){
            classEmployee ce = (classEmployee) o;
            if (ce.getNom()==this.Nom && ce.getAge()==this.Age){
                return true;
            }else {
                return false;
            }

        }

    }

