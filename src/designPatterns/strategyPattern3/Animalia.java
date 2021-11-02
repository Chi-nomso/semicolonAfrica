package designPatterns.strategyPattern3;

public abstract class Animalia {
    Movable movement;
    Speakable speaking;

    public String getMovement() {
        return movement.move();
    }

    public void setMovement(Movable movement) {

        this.movement = movement;
    }

    public String getSpeaking() {
        return speaking.speak();
    }

    public void setSpeaking(Speakable speaking) {
        this.speaking = speaking;
    }
}
