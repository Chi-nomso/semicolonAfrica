package designPatterns.strategyPattern2;

public class KnifeWeapon implements Weapon{

    @Override
    public String useWeapon() {
        return "Cutting with a knife";
    }
}
