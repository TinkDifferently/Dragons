package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

class BlueDragon extends Monsters {
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
        playType=MonsterTypeP.NonPlayeble;
        CounterAtack=true;
        SA1="True dmg";
        SA2="Active Defence";
    }

    @Override
    public void Atack(Dragon enemy) {
        enemy.GetDmg(10+2*UsefulScripts.LK);
        super.Atack(enemy);
    }

    @Override
    public void GetDmg(int dm) {
        enemy.hp-=dm*0.2;
        super.GetDmg(dm);
    }
    //   public BlueDragon() {
//
  //  }








}
