package company.Formation;

import company.BattleField.Position;
import company.Creature.Creature;

import java.util.Scanner;

public class FangYuan implements Formation {
    public boolean ifEmpty(Position[][] Field, int x, int y) {
        return Field[x][y].empty()&&Field[x+1][y+1].empty()&&Field[x+2][y+2].empty()&&Field[x+1][y+3].empty()&&Field[x][y+4].empty()&&Field[x-1][y+1].empty()&&Field[x-2][y+2].empty()&&Field[x-1][y+3].empty();
    }
    public void setCreatures(Position[][] Field, int x, int y, Creature[] creatures) {
        Scanner in=new Scanner(System.in);
        while(!(x>=2&&y<=10&&x<=12)){
            return;
        }
        while(!ifEmpty(Field,x,y)){
            return;
        }
        Field[x][y].creature=creatures[0];
        creatures[0].setXY(x,y);
        Field[x+1][y+1].creature=creatures[1];
        creatures[1].setXY(x+1,y+1);
        Field[x+2][y+2].creature=creatures[2];
        creatures[2].setXY(x+2,y+2);
        Field[x+1][y+3].creature=creatures[3];
        creatures[3].setXY(x+1,y+3);
        Field[x][y+4].creature=creatures[4];
        creatures[4].setXY(x,y+4);
        Field[x-1][y+1].creature=creatures[5];
        creatures[5].setXY(x-1,y+1);
        Field[x-2][y+2].creature=creatures[6];
        creatures[6].setXY(x-2,y+2);
    }
}
