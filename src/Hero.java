import java.util.Scanner;

public class Hero extends Character {

    private double scores = 0;

    Weapon weapon;
    Armor armor;



    Scanner scanner = new Scanner(System.in);


    public Hero(Weapon weapon,Armor armor){
        super();
        scores = 0;
        this.weapon = weapon;
        this.armor = armor;
    }


    @Override
    public void setCharacterInfo(Hero hero){

        System.out.println("(Please enter a name)");


        String tempname = scanner.nextLine();

        setName(tempname);
        System.out.println("My name is " + getName()+ " I am the hero of this dungeon!");
        hero.setStorage(50);
        setHealth(200);





    }


    @Override
    public void printCharacterInfo(Hero hero){

        System.out.println("Health: "+getHealth() + " " + hero.weapon.getName()+" weight: "+ hero.weapon.getWeight()+ " value: "+ hero.weapon.getValue()+ " damage: "+ hero.weapon.getDamage()+" range: "+hero.weapon.getRange());
        System.out.println("Armor " + hero.armor.getName()+ " Protection : "+ hero.armor.getProtection() + " Value : " + hero.armor.getValue() + " Weight : " + hero.armor.getWeight());



    }


    @Override
    public void printWeaponInfo(Hero hero){



        System.out.println("Weapon : " + hero.weapon.getName()+" weight: "+ hero.weapon.getWeight()+ " value: "+ hero.weapon.getValue()+ " damage: "+ hero.weapon.getDamage()+" range: "+hero.weapon.getRange());



    }

    public void printArmorInfo(Hero hero){



        System.out.println("Armor : " + hero.armor.getName()+ " Protection : "+ hero.armor.getProtection() + " Value : " + hero.armor.getValue() + " Weight : " + hero.armor.getWeight());


    }



    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
