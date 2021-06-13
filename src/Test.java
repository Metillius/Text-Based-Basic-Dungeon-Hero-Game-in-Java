import java.util.Random;

public class Test {
    public static void main(String[] args) {


        Hero hero = new Hero(Weapon.Old_Sword());
        Monster monster = new Monster(Weapon.The_Master_Sword());


        hero.printCharacterInfo(hero);



        System.out.println("***************************************");
        monster.monsterStatus();
        monster.printCharacterInfo(monster);







    }
 }
