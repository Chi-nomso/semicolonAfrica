package Chapter9Exercise.designPatterns.strategyPatternCharacter;

public class Troll extends Character {
    public Troll() {
        super();
        weapon = new BowAndArrowBehaviour();
    }

    @Override
    void fight() {
    }
}
