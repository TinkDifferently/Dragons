package Dragons;

import javax.swing.*;
import java.util.Random;

public class BlackDemon extends RedDragon {
  boolean Fury=true;
   // private int maxhp;

    public BlackDemon(int lifekoef) {
      //  super(0);
        hp=250*lifekoef;
        frame=new JFrame(this.getClass().getSimpleName());
        maxhp=hp;
        atack=14;
        defence=31;
        mindmg=16;
        maxdmg=75;
        luck=0;
        happy=1;
        CounterAtack=true;
    }

   // public BlackDemon() {
     //   super();
    //}

    protected void FuryAtack(){ Fury = false; int i = atack; atack=defence+5; defence=i-3; enemy.hp-=enemy.hp*0.22;};

   /*public BlackDemon (int lifekoef)
    {
        hp=250;
        maxhp=hp;
        atack=14;
        defence=31;
        mindmg=16;
        maxdmg=75;
        luck=0;
        happy=1;
        CounterAtack=true;
    }*/
    @Override
    public void Atack(Dragon enemy) {
      if ((hp<0.4*maxhp)&&(Fury==true)) FuryAtack();
        super.Atack(enemy);
    }
    @Override
    public void GetDmg(int dm) {
        hp-=dm;
    }
}
