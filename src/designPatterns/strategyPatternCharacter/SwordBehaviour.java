package designPatterns.strategyPatternCharacter;

public class SwordBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "Swinging a Sword";
    }
}
