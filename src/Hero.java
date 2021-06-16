import java.util.Scanner;

public class Hero extends Character {

    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Scanner scanner = new Scanner(System.in);


    public Hero(Weapon weapon){
        super();
        this.weapon = weapon;
    }


    public void printCharacterInfo(Hero hero){

        System.out.println("(Please enter a name)");
        String tempname = scanner.nextLine();

        setName(tempname);
        System.out.println("My name is " + getName()+ " I am the hero of this dungeon!");
        hero.setStorage(30);
        setHealth(100);
        System.out.println(getName());


        System.out.println(" Health: "+getHealth() +" name: "+ hero.weapon.getName()+" weight: "+ hero.weapon.getWeight()+ " value: "+ hero.weapon.getValue()+ " damage: "+ hero.weapon.getDamage()+" range: "+hero.weapon.getRange());


    }
    public void printItemInfo(Hero hero){



        System.out.println(" name: "+hero.weapon.getName()+" weight: "+ hero.weapon.getWeight()+ " value: "+ hero.weapon.getValue()+ " damage: "+ hero.weapon.getDamage()+" range: "+hero.weapon.getRange());


    }

}
