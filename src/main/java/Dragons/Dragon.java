package Dragons;

import javax.swing.*;

public abstract class Dragon {
    protected int FramePosX=0;
    protected int FramePosY=0;
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
    public void setLoc(int x, int y){
        FramePosX=x;
        FramePosY=y;
    }



    protected Dragon() {
    }
    public abstract void CD () ;
    public abstract String GiveSetStr(int page);
    public abstract void Atack(Dragon enemy);
    public abstract  void Counteratack(Dragon enemy);
    public abstract double GetLuck();
    public abstract void GetHappy();
    public abstract void FrameUpd();
}
