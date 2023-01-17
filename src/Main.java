public class Main {
    public static void main(String[] args) {
        Stadium stadium = new Stadium("Olympic","Lenina");
        Voleyball voleyball = new Voleyball(TypeOfSport.GROUND,stadium,12,20,"Zulfia");
        System.out.println(voleyball.getInfo());
        voleyball.goPass();
        voleyball.goPass("pass!");
        Stadium stadium1 = new Stadium("national","Chui 2");
        Pioneerball pioneerball = new Pioneerball(TypeOfSport.GROUND,stadium1,12,10,"Nooruz",2);
        System.out.println(pioneerball.getInfo());
        pioneerball.goPass();
        pioneerball.goPass("go pass!");
        Stadium stadium2 = new Stadium("Kelechek","Toktogul 2");
        Pioneerball pioneerball1= new Pioneerball(TypeOfSport.GROUND,stadium2,12,22,"Aizhan",2);
        System.out.println(pioneerball1.getInfo());
        pioneerball1.goPass();
        pioneerball1.goPass("pass me!");


    }
}