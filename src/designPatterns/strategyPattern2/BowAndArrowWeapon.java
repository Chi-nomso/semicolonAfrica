package designPatterns.strategyPattern2;

public class BowAndArrowWeapon implements Weapon{

    @Override
    public String useWeapon() {
        return "Piercing through your body like an Arrow";
    }
}
