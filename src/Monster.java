import java.util.Random;
public class Monster extends Character {

    Random random = new Random();
    //compositionu burda kullandık vurdaki ilişki hero has a weapon ve hero has a armor ilişkisi
    Weapon weapon;
    Armor armor;


    public Monster(Weapon weapon, Armor armor){
        super();
        this.weapon = weapon;
        this.armor=armor;
    }

    //monsterın random bi silah ve zırh alması burda sağlanıyo silah ve zırh ne kadar güçlüyse monsterın onu alma ihtimali o kadar az oluyo
    public void monsterStatus(){

        int weapon_number;
        weapon_number = random.nextInt(23);
        weapon_number += 1;

        if(weapon_number == 1 || weapon_number == 2 || weapon_number == 3 || weapon_number == 4 || weapon_number == 5 || weapon_number==6 ){

            setWeapon(Weapon.Old_Sword());

        }
        if(weapon_number == 7 || weapon_number == 8 || weapon_number == 9 || weapon_number == 10 ){

            setWeapon(Weapon.Travellers_Sword());

        }
        if(weapon_number == 11 || weapon_number == 12 ){

            setWeapon(Weapon.Claymore());
        }
        if(weapon_number == 13){

            setWeapon(Weapon.The_Master_Sword());
        }
        if(weapon_number == 14 || weapon_number == 15 || weapon_number==16 ){

            setWeapon(Weapon.Woodcutter_Axe());
        }
        if(weapon_number == 17 ){

            setWeapon(Weapon.Double_Axe());
        }
        if(weapon_number == 18 || weapon_number == 19 || weapon_number == 20 ){

            setWeapon(Weapon.Wooden_Bow());
        }
        if(weapon_number == 21 || weapon_number == 22){

            setWeapon(Weapon.Elven_Bow());
        }
        if(weapon_number == 23 ){

            setWeapon(Weapon.Dragobone_Bow());
        }



        int armor_number;
        armor_number = random.nextInt(11);
        armor_number += 1;

        if(armor_number == 1 || armor_number == 2 || armor_number == 3 || armor_number == 4 || armor_number == 5 || armor_number ==6 ){

            setArmor(Armor.leatherArmor());

        }
        if(armor_number == 7 || armor_number == 8 || armor_number == 9|| armor_number ==10 ){

            setArmor(Armor.ironArmor());

        }
        if(armor_number == 11 ){

            setArmor(Armor.ebonyArmor());
        }



    }




    @Override
    public void printCharacterInfo(Monster monster){



        setHealth(30);


        System.out.println( "~~~Orc " + " Health: "+getHealth() +" "+monster.weapon.getName()+" weight: "+ monster.weapon.getWeight()+ " value: "+ monster.weapon.getValue()+ " damage: "+ monster.weapon.getDamage()+" range: "+monster.weapon.getRange());
        System.out.println("Armor " + monster.armor.getName()+ " Protection : "+ monster.armor.getProtection() + " Value : " + monster.armor.getValue() + " Weight : " + monster.armor.getWeight());



    }


    @Override
    public void printWeaponInfo(Monster monster){



        System.out.println(" Weapon "+ monster.weapon.getName()+" weight: "+ monster.weapon.getWeight()+ " value: "+ monster.weapon.getValue()+ " damage: "+ monster.weapon.getDamage()+" range: "+monster.weapon.getRange());


    }

    @Override
    public void printArmorInfo(Monster monster){

        System.out.println("Armor " + monster.armor.getName()+ " Protection : "+ monster.armor.getProtection() + " Value : " + monster.armor.getValue() + " Weight : " + monster.armor.getWeight());

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
