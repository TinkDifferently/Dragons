package Dragons;

import javax.swing.*;

public class AncientTrent extends Guards{
int lifeEnergy;
    public AncientTrent(int LK){
        hp=150*LK;
        lifeEnergy=200;
        maxhp=hp;
        atack=0;
        defence=10;
        mindmg=4;
        maxdmg=5;
        luck=0;
        happy=0;
        CounterAtack=true;
        playType=MonsterTypeP.Playeble;
        frame=new JFrame(this.getClass().getSimpleName());
    }
    public void CD() {

    }

    public String GiveSetStr(int page) {
        String S;
        switch (page) {
            case 0:
                S = "Выберите действие(" + page + "/" + "4):" + "\n" + "0 - выход" + "\n" + "\n" +
                        "\n" + "\n" + "\n" + "100 - Информация" + "\n" + "102 - следующая страница";
                break;
            case 1:
                S = "Выберите действие(" + page + "/" + "4):" + "\n" + "1 - Стальная кора 20" + "\n" + "2 - Смертоносные ветви 35" + "\n" + "3 - Величественная крона 21" +
                        "\n" + "4 - Вечное проклятие" + "\n\n" + "100 - Информация" + "\n" + "101 - предыдущая страница" + "\n" + "102 - следующая страница";
                break;
            /*case 2: S="Выберите специальное действие("+page+"/"+"4):" + "\n\n"; if (HolyAttackCD>0) S+="святая атака "+"заблокировано("+HolyAttackCD+")"+"\n"; else S+="5 - святая атака"+
                    "\n"; if (HolyArmCD>0) S+="доспехи света "+"заблокировано("+HolyArmCD+")"+"\n"; else S+="6 - доспехи света"+
                    "\n"; if (PrayCD>0) S+="молитва "+"заблокировано("+PrayCD+")"+"\n"; else S+="7 - молитва"+
                    "\n"; if (MeditCD>0) S+="медитация "+"заблокировано("+MeditCD+")"; else S+="8 - медитация";
                S+="\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница";
                break;
            case 3: S="Выберите заклинание("+page+"/"+"4):" + "\n\n"; if (LightBoltCD>0) S+="молния "+"заблокировано("+LightBoltCD+")"+"\n"; else S+="9   -  молния"+
                    "\n"; if (HumbleValianceCD>0) S+="смиренная доблесть "+"заблокировано("+HumbleValianceCD+")"+"\n"; else S+="10 - смиреная доблесть"+
                    "\n"; if (LightGuardianCD>0) S+="светлый страж "+"заблокировано("+LightGuardianCD+")"+"\n"; else S+="11 - светлый страж"+
                    "\n"; if (GodsMercyCd>0) S+="божественная милость "+"заблокировано("+GodsMercyCd+")"; else S+="12 - божественная милость";
                S+="\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница"; break;
            case 4: S="Выберите знак("+page+"/"+"4):" + "\n\n"; if (SignCd>0) S+="знак света "+"заблокировано("+SignCd+")"+"\n"; else S+="13 - знак света"+
                    "\n"; if (SignCd>0) S+="знак грома "+"заблокировано("+SignCd+")"+"\n"; else S+="14 - знак грома"+
                    "\n"; if (SignCd>0) S+="знак мощи "+"заблокировано("+SignCd+")"+"\n"; else S+="15 - знак мощи"+
                    "\n"; if (SignCd>0) S+="знак отваги "+"заблокировано("+SignCd+")"; else S+="16 - знак отваги";
                S+="\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница"; break; */
            default : S="Error: page not found"+"\n"+"0 - for exit"; JOptionPane.showMessageDialog(frame,S);
        }
        return S;
    }

    public void Atack(Dragon enemy) {

    }

    public void GetDmg(int dm) {

    }

    public void Counteratack(Dragon enemy) {

    }

    public double GetLuck() {
        return 0;
    }

    public boolean Action(int i) {
        return false;
    }

    /*
    1 кора - временное увеличение брони
    2 ветви - временное увеличение урона
    3 крона - временно увеличение мощи и максимального хп
    4 вечное проклятье - лечение в процентах от максимума
    5 смертоносные корни - пять ударов подряд
    6 разрыв энергии - противнику наносится урон, а свое хп может как восстановиться, так и снизиться
    7 нестабильная энергия
    8 восстановление энергии
    9 мудрость леса
    0 ярость леса
    1 песнь леса
    2 сила леса
    3 знак вечного леса
    4 проклятый знак
    5 знак смерти
    6 знак жизни
    */
}
