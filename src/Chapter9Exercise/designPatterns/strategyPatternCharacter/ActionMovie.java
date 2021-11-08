package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public class ActionMovie {
    public static void main(String[] args) {
        Character igwe = new King();
        Character lolo = new Queen();
        Character soldier = new Knight();
        Character servant = new Troll();
        System.out.println("King "+igwe.getWeapon());

        System.out.println();

        Character eze = new King();
        eze.setWeapon(new SwordBehaviour());
        System.out.println(eze.getWeapon());

        System.out.println("Queen "+ lolo.getWeapon());
        System.out.println();

        System.out.println("Knight "+ soldier.getWeapon());
        System.out.println();

        System.out.println("Servant "+ servant.getWeapon());
    }
}
