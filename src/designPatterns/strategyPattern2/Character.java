package designPatterns.strategyPattern2;

public abstract class Character {
    Weapon weapon;
    String fight;

    public String getWeapon() {
        return weapon.useWeapon();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getFight() {
        return "I will fight and conquer you today";
    }

    public void setFight(String fight) {
        this.fight = fight;
    }
}
