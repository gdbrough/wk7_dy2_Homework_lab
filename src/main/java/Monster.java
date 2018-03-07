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

    public void setHealthValue(int newHealthValue) {
        this.healthValue = newHealthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public int attackArmy(Army army){
        int postAttackHealth = army.getHealthValue() - getAttackValue();
        army.setHealthValue(postAttackHealth);
        return army.getHealthValue();
    }

    public int incomingAttack(Army army){
        return this.healthValue -= army.getAttackValue();
    }


}
