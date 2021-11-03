package designPatterns.strategyPatternCharacter;

public class Knight extends Character{
    public Knight() {
        //super();
        weapon = new SwordBehaviour();
    }

    @Override
    void fight() {
    }
}
