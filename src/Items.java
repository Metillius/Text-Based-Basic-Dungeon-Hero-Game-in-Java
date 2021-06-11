public class Items {

    private int weight;
    private double value;
    private int damage;
    private int armorAmount;
    private int range;

    public Item(){}
    public Item(int weight, double value, int damage,int armorAmount,int range) {
        this.weight = weight;
        this.value = value;
        this.damage = damage;
        this.armorAmount = armorAmount;
        this.range = range;
    }

    public int getArmorAmount() {
        return armorAmount;
    }

    public void setArmorAmount(int armorAmount) {
        this.armorAmount = armorAmount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
 
}
