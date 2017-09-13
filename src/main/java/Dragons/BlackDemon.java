package Dragons;

import javax.swing.*;
import java.util.Random;

public class BlackDemon extends Monsters {
  boolean Fury=true;

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
        playType=MonsterTypeP.NonPlayeble;
        CounterAtack=true;
        SA1="Fury Atack";
        SA2="Curse";
    }

   // public BlackDemon() {
     //   super();
    //}

    protected void FuryAtack(){ Fury = false; int i = atack; atack=defence+5; defence=i-3; enemy.hp-=enemy.hp*0.22; luck=3;}
    protected void Curse(){      Random ran=new Random();
        enemy.defence-=ran.nextInt(3);
        enemy.atack-=ran.nextInt(3);
        if (enemy.defence<-5) enemy.defence=-5;
        if (enemy.atack<-5) enemy.atack=-5;}


    @Override
    public void Atack(Dragon enemy) {
      if ((hp<0.4*maxhp)&&(Fury==true)) FuryAtack();
        Curse();
        super.Atack(enemy);
    }
}
