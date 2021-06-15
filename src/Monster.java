import java.util.Random;
public class Monster extends Character {

    Random random = new Random();
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Monster(Weapon weapon){
        super();
        this.weapon = weapon;
    }

    public void monsterStatus(){

        int weapon_number;
        weapon_number = random.nextInt(17);
        weapon_number += 1;

        if(weapon_number == 1 || weapon_number == 2 || weapon_number == 3 || weapon_number == 4 ){

            setWeapon(Weapon.Old_Sword());

        }
        if(weapon_number == 5 || weapon_number == 6 || weapon_number == 7 ){

            setWeapon(Weapon.Travellers_Sword());

        }
        if(weapon_number == 8 ){

            setWeapon(Weapon.Claymore());
        }
        if(weapon_number == 9){

            setWeapon(Weapon.The_Master_Sword());
        }
        if(weapon_number == 10 || weapon_number == 11 ){

            setWeapon(Weapon.Woodcutter_Axe());
        }
        if(weapon_number == 12 ){

            setWeapon(Weapon.Double_Axe());
        }
        if(weapon_number == 13 || weapon_number == 14 || weapon_number == 15 ){

            setWeapon(Weapon.Wooden_Bow());
        }
        if(weapon_number == 16){

            setWeapon(Weapon.Elven_Bow());
        }
        if(weapon_number == 17 ){

            setWeapon(Weapon.Dragobone_Bow());
        }



    }



    public void printCharacterInfo(Monster monster){



        setHealth(25);


        System.out.println(" Health: "+getHealth() +" name: "+monster.weapon.getName()+" weight: "+ monster.weapon.getWeight()+ " value: "+ monster.weapon.getValue()+ " damage: "+ monster.weapon.getDamage()+" range: "+monster.weapon.getRange());


    }

}
