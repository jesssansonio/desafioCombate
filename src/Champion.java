public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(Champion other){
        int damageDefault = 1;
        if (armor > other.attack) {
            life -= damageDefault;

        } else {
            life = (life - other.getAttack()) + this.armor;

        }
    }

    public String status(){
        if (life <= 0) {
            life = 0;
            return name
                    + ": "
                    + life
                    + " de vida (morreu)";
        } else {
            return name
                    + ": "
                    + life
                    + " de vida";
        }
    }
}
