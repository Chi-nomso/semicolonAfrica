package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public class King extends Character{
    public King() {
        super();
        weapon = new KnifeBehaviour();
    }


    @Override
    void fight() {

    }
}
