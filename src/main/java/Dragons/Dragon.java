package Dragons;

import javax.swing.*;

public abstract class Dragon {
    int hp;
    int maxhp;
    int atack;
    int mindmg;
    int maxdmg;
    int defence;
    int luck;
    int happy;
    JFrame frame;
    Dragon enemy;
    boolean CounterAtack;



    protected Dragon() {
    }

    public abstract void Atack(Dragon enemy);
    public abstract  void Counteratack(Dragon enemy);
    public abstract double GetLuck();
    public abstract void GetHappy();
    public abstract void FrameUpd();
}
