import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game implements GameMechanics {

    Scanner scanner = new Scanner(System.in);
    static Hero scorehero = new Hero(Weapon.Old_Sword(),Armor.leatherArmor());



    String w = "Weapon";
    String a = "Armor";
    String m = "Monster";
    String y = "yes";
    String z = "You didn't pick this item";
    String p = "Would you like to pick it up? yes/no";
    String next = "--------------------------\n" +
            "--Going to the next room--\n" +
            "--------------------------\n";



    public static void highScoreCreator(){

        FileWriter highscores = null;


        try {

            highscores = new FileWriter("HighScores.txt");
            highscores.write("Hero : "+ scorehero.getName()+ "'s score is : " +scorehero.getScores() );
            highscores.close();

        }


        catch (

                IOException e) {
            System.out.println("This scores cannot be written in a file");

        }


    }



    @Override
    public void fighting() {

        Hero hero = new Hero(Weapon.Old_Sword(),Armor.leatherArmor());
        Monster monster = new Monster(Weapon.The_Master_Sword(),Armor.ebonyArmor());
        Townspeople townspeople = new Townspeople();




        System.out.println("_________________________________");
        System.out.println("   ______W_E_L_C_O_M_E______");
        System.out.println();

        hero.setCharacterInfo(hero);



        for(int level = 1; level <= 16; level++){
            for(int room =1; room <= 4; room++){

        hero.printCharacterInfo(hero);
                System.out.println();
        System.out.println(normalLine);
                System.out.println();
                System.out.println(roomInfo);
        monster.monsterStatus();
        monster.printCharacterInfo(monster);

        System.out.println(fightChoice);
                System.out.println(normalLine);
        String decision = scanner.nextLine();

        while (hero.getHealth() >= 0 && monster.getHealth() >= 0) {

            if (decision.equals(y)) {
                monster.setHealth((monster.getHealth()) +monster.armor.getProtection() - (hero.weapon.getDamage()*hero.weapon.getRange()));
                System.out.println(m + "'s HP: " +monster.getHealth());
                hero.setHealth((hero.getHealth()) +hero.armor.getProtection() - (monster.weapon.getDamage()*monster.weapon.getRange()));
                System.out.println("Your HP :" + hero.getHealth());


                if (hero.getHealth() <= 0){


                    System.out.println();
                    System.out.println(deathLine);
                    System.out.println(fallenHero);
                    System.out.println(deathLine);
                    System.out.println(gameOver);
                    scorehero.setName(hero.getName());
                    scorehero.setScores(hero.getScores());
                    highScoreCreator();

                    System.exit(0);

                }


                if(monster.getHealth() <= 0){
                    System.out.println( m +" died. Its "+w+" is: " );
                    monster.printWeaponInfo(monster);
                    System.out.println(p);
                    System.out.println(normalLine);

                    String tempanswer = scanner.nextLine();

                    if(tempanswer.equals(y) && hero.getStorage() > 0 && hero.getStorage()> monster.weapon.getWeight()){

                        hero.setStorage(hero.getStorage()-monster.weapon.getWeight());
                        hero.setWeapon(monster.getWeapon());
                        hero.setScores(hero.getScores()+monster.weapon.getValue());
                        System.out.println("Your "+w+" is : ");
                        hero.printWeaponInfo(hero);
                        System.out.println(storageLine);
                        System.out.println("⚛__Your storage has " + hero.getStorage()+" empty kilograms__⚛");
                        System.out.println(storageLine);



                        System.out.println("Its "+a+" is: " );
                        monster.printArmorInfo(monster);
                        System.out.println(p);
                        System.out.println(normalLine);

                        String tempanswer2 = scanner.nextLine();

                        if(tempanswer2.equals(y) && hero.getStorage() > 0 && hero.getStorage() > monster.armor.getWeight()){

                            hero.setStorage(hero.getStorage()-monster.armor.getWeight());
                            hero.setArmor(monster.getArmor());
                            hero.setScores(hero.getScores()+monster.armor.getValue());
                            System.out.println("Your  are : ");
                            hero.printArmorInfo(hero);
                            System.out.println(storageLine);
                            System.out.println("⚛__Your storage has " + hero.getStorage()+" empty kilograms__⚛");
                            System.out.println(storageLine);




                        }

                        else{
                            System.out.println(z);

                        }




                    }

                    else{
                        System.out.println(z);

                    }




                    Random random = new Random();
                    int heal_or_not = random.nextInt(3)+1;

                    if(heal_or_not == 1){
                        townspeople.healing();
                        hero.setHealth(hero.getHealth()+townspeople.healingAmount);
                        hero.setScores(hero.getScores()+10);
                        hero.printCharacterInfo(hero);

                    }

                    else{

                        System.out.println("There is no townspeople in this room");

                    }

                    monster.setHealth(monster.getHealth()-50);

                }




            }



            else {
                break;
            }





        }


                System.out.println();
                System.out.println(next);
                System.out.println();


    }


            if(hero.getHealth() >= 0){

                //TEXTS FOR NEXT LEVEL
                System.out.println();
                System.out.println(levelLine);
                System.out.println(nextLevel);
                System.out.println(levelLine);

            }





        }


        System.out.println(gameOver);
        scorehero.setName(hero.getName());
        scorehero.setScores(hero.getScores());
        highScoreCreator();



    }

}
