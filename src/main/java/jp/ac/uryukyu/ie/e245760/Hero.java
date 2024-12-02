package jp.ac.uryukyu.ie.e245760;

public class Hero extends LivingThing{

    public Hero (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        setHitPoint(getHitpoint() - damage);
        
        if(getHitpoint() < 0) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}