public abstract class Character {

    private int health;
    private String name;
    private int storage;



    public Character(){}
    public Character(int health, String name) {
        this.health = health;
        this.name = name;
    }


    public void setCharacterInfo(Hero hero){
        System.out.println("In the future subclasses of this class will set their info");
    }
    public void printCharacterInfo(Hero hero){
        System.out.println("In the future subclasses of this class will print out their info");
    }
    public void printCharacterInfo(Monster monster){
        System.out.println("In the future subclasses of this class will print out their info");
    }
    public void printWeaponInfo(Hero hero){
        System.out.println("In the future subclasses of this class will print out their item info");
    }
    public void printArmorInfo(Hero hero){
        System.out.println("In the future subclasses of this class will print out their armor info");
    }
    public void printWeaponInfo(Monster monster){
        System.out.println("In the future subclasses of this class will print out their item info");
    }
    public void printArmorInfo(Monster monster){
        System.out.println("In the future subclasses of this class will print out their armor info");
    }




    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


}
