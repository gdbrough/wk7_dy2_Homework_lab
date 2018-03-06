public abstract class Monster {

    private String name;
    private int healthValue;
    private int attackValue;

    public Monster(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public int attackArmy(){
        return getAttackValue();
    }

    public int incomingAttack(Army army){
        return this.healthValue -= army.getAttackValue();
    }


}
