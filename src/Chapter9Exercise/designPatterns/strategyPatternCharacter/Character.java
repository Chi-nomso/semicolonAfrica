package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public abstract class Character {

    public Character(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public Character() {

    }

    WeaponBehaviour weapon;

    abstract void fight();

    public String getWeapon() {
        return weapon.useWeapon();
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
}
