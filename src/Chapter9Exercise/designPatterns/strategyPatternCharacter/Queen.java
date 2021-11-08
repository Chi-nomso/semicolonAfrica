package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public class Queen extends Character{
    public Queen() {
        super();
        weapon = new AxeBehaviour();
    }

    @Override
    void fight() {
    }
}
