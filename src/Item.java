public class Item {

    private String name;
    private int weight;
    private double value;
    private int damage;
    private int protection;
    private int range;








    public Item(String name, int weight, double value, int damage, int range) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.damage = damage;
        this.range = range;
    }

    public Item(String name, double value) {

    }


    public Item(String name, int protection,double value,int weight){
        this.name = name;
        this.protection = protection;
        this.value = value;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int Protection) {
        this.protection = protection;
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
