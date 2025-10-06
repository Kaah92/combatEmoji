public class WeightRange {

    public static Fighter[] fighters = new Fighter[6];
    {
        for (Fighter fighter : fighters) System.out.println(fighter.getToString());
    }

    public static Fighter[] presentationOfFighters() {
        fighters[0] = new Fighter("Pretty boy", "França", 31 ,1.75, 68.9, "12", "3", "1");
        fighters[1] = new Fighter("Putscript", "Brasil", 29 ,1.70, 60.0, "10", "4", "0");
        fighters[2] = new Fighter("Snapshadow", "EUA", 35,1.69, 58.2, "9", "3", "2");
        fighters[3] = new Fighter("Dead Code", "Australia", 27 ,1.80, 90.2, "14", "2", "0");
        fighters[4] = new Fighter("Capsloko", "Espanha", 30 ,1.79, 92.1, "12", "3", "2");
        fighters[5] = new Fighter("Tapascript", "Argentina", 27 ,1.67, 57.9, "6", "4", "3");

        return new Fighter[] {fighters[0], fighters[1], fighters[2], fighters[3], fighters[4],fighters[5]};
    }

    public static void status(){
        fighters = presentationOfFighters();
    }
}