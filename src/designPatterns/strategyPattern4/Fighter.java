package designPatterns.strategyPattern4;

public abstract class Fighter {
  Action kickAct;
    Action displayAct;

    public String getDisplayAct() {
        return displayAct.Display();
    }

    public void setDisplayAct(Action displayAct) {
        this.displayAct = displayAct;
    }


    public String getKickAct() {
        return kickAct.kick();
    }

    public void setKickAct(Action kickAct) {
        this.kickAct = kickAct;
    }
}
