package jp.ac.uryukyu.ie.e245760;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    public void attackWithWeponSkillTest() {
        int Hp;
        Warrior warrior = new Warrior("戦士", 100, 100);
        Enemy goblin = new Enemy("ゴブリン", 400, 100);

        for(int count=0; count<3; count++){
            Hp = goblin.getHitpoint();
            warrior.attackWithWeponSkill(goblin); 
            assertEquals(warrior.getAttack() * 1.5, Hp - goblin.getHitpoint());
        }
    }
}