public class Fighter {

    private String name;
    private String nationality;
    private int age;
    private double heigth;
    private double weight;
    private String category;
    private String victory;
    private String defeats;
    private String draws;

    public Fighter(){}

    public Fighter(String name, String nationality, int age, double heigth, double weight, String victory, String defeats, String draws){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.heigth = heigth;
        this.weight = weight;
        this.victory = victory;
        this.defeats = defeats; //derrotas
        this.draws = draws; //empates
    }

    public String getToString(){
        System.out.println("Lutador: " + getName() + "\n" + "Nacionalidade: " + getNationality() + "\nIdade: " + getAge() + " anos " + "\nAltura: " + getHeigth() + " m de altura" + "\n" + "Pesando: " + getWeight() + " kg" + "\n" + "Ganhou: " + getVictory() + "\n" + "Perdeu: " + getDefeats() + "\n" + "Empatou: " + getDraws() + " vezes");
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeigth() {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (getWeight() < 52)
            System.out.println(this.category = "Peso fora das categorias de competição");
        if (getWeight() <= 70.3)
            System.out.println(this.category = "Peso leve");
        if (getWeight() <= 83.9)
            System.out.println(this.category = "Peso médio");
        if (getWeight() <= 120)
            System.out.println(this.category = "Peso pesado");
        else
            System.out.println(this.category = "Peso fora das categorias de competição");
    }

    public String getVictory() {
        return victory;
    }

    public void setVictory(String victory) {
        this.victory = victory;
    }

    public String getDefeats() {
        return defeats;
    }

    public void setDefeats(String defeats) {
        this.defeats = defeats;
    }

    public String getDraws() {
        return draws;
    }

    public void setDraws(String draws) {
        this.draws = draws;
    }

    /*public void status(){
        System.out.println(getName());
        System.out.println(getVictory());
        System.out.println(getDefeats());
        System.out.println(getDraws());
    }*/

    /*public void ganharLutar(){
        setVictory(getVictory() + 1);
    }
    public void perderLuta(){
        setDefeats(getDefeats() + 1);
    }
    public void empatarLutar(){
        setDraws(getDraws() + 1);
    }*/
}