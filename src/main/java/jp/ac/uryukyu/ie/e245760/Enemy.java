package jp.ac.uryukyu.ie.e245760;

public class Enemy extends LivingThing{

    public Enemy (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        setHitPoint(getHitpoint() - damage);
        
        if(getHitpoint() < 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}