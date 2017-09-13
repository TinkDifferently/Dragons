package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class RedDragon  extends Monsters {

private int BlockChance=67;

    public RedDragon(int lifekoef) {
        hp=210*lifekoef;
        frame=new JFrame(this.getClass().getSimpleName());
        maxhp=hp;
        atack=22;
        defence=25;
        mindmg=20;
        maxdmg=55;
        luck=2;
        happy=3;
        playType=MonsterTypeP.NonPlayeble;
        CounterAtack=true;
        SA1="Block";
        SA2="Super happy";
    }
    private boolean Block(){
        Random ran =new Random();
        if (ran.nextInt(100)>BlockChance) return false;
        else return true;
    }
    @Override //имеет 67% шанс заблокировать урон.
    public void GetDmg(int dm) {
        if (!Block())
        hp-=dm;
        else hp-=dm/3;
    }
@Override
    public void GetHappy() {//счастливчик. Вероятность доп атаки 80%
        Random ran=new Random();
    int i=ran.nextInt(100)*happy; if (i>60) this.Atack(enemy);
    }


}
