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
    }

 //   public BlueDragon() {
//
  //  }








}
