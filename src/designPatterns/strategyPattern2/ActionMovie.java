package designPatterns.strategyPattern2;

public class ActionMovie {
    public static void main(String[] args) {
        //objects of each clients
        King igwe = new King();
        Queen lolo = new Queen();
        Knight soldier = new Knight();
        Troll tool = new Troll();
        System.out.println();

        //King to fight with an Axe.
        System.out.println("King says: "+igwe.getFight());
        igwe.setWeapon(new AxeWeapon());
        System.out.println("King says: "+ igwe.getWeapon());
        System.out.println();

        //Queen to fight with a Knife
        System.out.println("Queen says: "+ lolo.getFight());
        lolo.setWeapon(new KnifeWeapon());
        System.out.println("Queen says: "+ lolo.getWeapon());
        System.out.println();

        //Knight to fight with a Sword
        System.out.println("Knight says: "+ soldier.getFight());
        soldier.setWeapon(new SwordWeapon());
        System.out.println("Knight says: " + soldier.getWeapon());
        System.out.println();

        //Troll to fight with Bow And Arrow
        System.out.println("Troll says: " + tool.getFight());
        tool.setWeapon(new BowAndArrowWeapon());
        System.out.println("Troll says: "+ tool.getWeapon());
    }
}
