public abstract class Army {

    private String name;
    private int healthValue;
    private int attackValue;

    public Army(String name, int healthValue, int attackValue) {
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

    public void setHealthValue(int newHealthValue) {
        this.healthValue = newHealthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public int attackMonster(Monster monster){
        int postAttackHealth = monster.getHealthValue() - getAttackValue();
        monster.setHealthValue(postAttackHealth);
        return monster.getHealthValue();
    }

    public int incomingAttack(Monster monster){
        return this.healthValue -= monster.getAttackValue();
    }


}
