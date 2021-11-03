package designPatterns.strategyPattern4;

public class MainGame {
    public static void main(String[] args) {
        Fighter chunli = new ChunLi();
        System.out.println("ChunLi " + chunli.getDisplayAct());
        System.out.println("ChunLi " + chunli.getKickAct());
        System.out.println();

        Fighter ken = new Ken();
        System.out.println("Ken " + ken.getDisplayAct());
        System.out.println("Ken " + ken.getKickAct());
        System.out.println();

        Fighter ryu = new Ryu();
        System.out.println("Ryu " + ryu.getDisplayAct());
        System.out.println("Ryu " + ryu.getKickAct());
    }
}
