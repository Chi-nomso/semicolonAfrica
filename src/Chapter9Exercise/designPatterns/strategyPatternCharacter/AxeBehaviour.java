package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public class AxeBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "Chopping with an Axe";
    }
}
