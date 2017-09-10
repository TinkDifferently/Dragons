package Dragons;

import javax.swing.*;
import java.util.Random;

class BlueDragon extends Dragon {
    public BlueDragon(int lifekoef) {
        hp=420*lifekoef;
        frame=new JFrame(this.getClass().getSimpleName());
        maxhp=hp;
        atack=15;
        defence=31;
        mindmg=10;
        maxdmg=40;
        luck=1;
        happy=2;
        CounterAtack=true;
    }

 //   public BlueDragon() {
//
  //  }

    public void Atack(Dragon enemy) {
        //CounterAtack=true;
        Random ran=new Random();
        double koef = (atack-enemy.defence)*0.05+1;
        if (koef<0.25) koef=0.25;
        if (koef>5) koef=5;
        enemy.hp-=(ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck();
          if (enemy.hp<=0) throw new NullPointerException(this.getClass().getSimpleName());
        enemy.Counteratack(this);
        if (hp<=0) throw new NullPointerException(enemy.getClass().getName());
        GetHappy();
        enemy.CounterAtack=true;
    }



    public void Counteratack(Dragon enemy) {
        if (CounterAtack == true) {
            CounterAtack = false;
            Random ran = new Random();
            double koef = (atack-enemy.defence)*0.05+1;
            if (koef<0.5) koef=0.5;
            enemy.hp-=(ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck();
        }
    }

    public double GetLuck() {
        Random ran=new Random();
        int i = ran.nextInt(10) * luck;
        if (i>9) return 1.5; else return 1;
    }


    public void GetHappy() {
        Random ran=new Random();
        int i=ran.nextInt(10)*happy; if (i>10) this.Atack(enemy);
    }
    public void FrameUpd() {
        frame=new JFrame(this.getClass().getSimpleName());
    }

}
