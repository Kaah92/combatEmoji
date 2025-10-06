//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        WeightRange.status();

        for(int i = 0; i < WeightRange.fighters.length; i++)
        System.out.println(WeightRange.fighters[i].getToString());
    }
}