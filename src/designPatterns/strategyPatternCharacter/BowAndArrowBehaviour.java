package designPatterns.strategyPatternCharacter;

public class BowAndArrowBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "Slinging the arrow with a Bow";
    }
}
