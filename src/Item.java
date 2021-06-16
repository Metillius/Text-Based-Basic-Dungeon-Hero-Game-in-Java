public class Item {

    private String name;
    private String rare;
    private int weight;
    private double value;
    private int damage;
    private int armorAmount;
    private int range;



    public Item(String name,int weight, double value, int damage,int armorAmount,int range) {
        this.weight = weight;
        this.value = value;
        this.damage = damage;
        this.armorAmount = armorAmount;
        this.range = range;
    }
    public Item(String name, int weight, double value, int damage, int range) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.damage = damage;
        this.range = range;
    }

    public Item(String name, double value) {

    }


    public Item(String name, String rare){
        this.name = name;
        this.rare = rare;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRare() {
        return rare;
    }

    public void setRare(String rare) {
        this.rare = rare;
    }

}
