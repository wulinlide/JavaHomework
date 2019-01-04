package company.Formation;

import company.BattleField.Position;
import company.Creature.Creature;

public interface Formation {
    boolean ifEmpty(Position[][] Field, int x, int y);
    void setCreatures(Position[][] Field, int x, int y, Creature[] creatures);
}