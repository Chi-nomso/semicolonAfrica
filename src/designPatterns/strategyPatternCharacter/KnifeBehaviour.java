package designPatterns.strategyPatternCharacter;

public class KnifeBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "Cutting with a Knife";
    }
}
