import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    public void fighting() {

        Hero hero = new Hero(Weapon.Old_Sword());
        Monster monster = new Monster(Weapon.The_Master_Sword());


        hero.printCharacterInfo(hero);


        System.out.println("***************************************");
        monster.monsterStatus();
        monster.printCharacterInfo(monster);

        System.out.println("Would you like to fight with this monster? yes/no ");
        String decision = scanner.nextLine();

        while (hero.getHealth() >= 0 && monster.getHealth() >= 0) {
            if (decision.equals("yes")) {
                monster.setHealth((monster.getHealth()) - (hero.weapon.getDamage()));
                System.out.println("Monsters HP: " +monster.getHealth());
                hero.setHealth((hero.getHealth()) - (monster.weapon.getDamage()));
                System.out.println("Your HP :" + hero.getHealth());

                if(monster.getHealth() <= 0){
                    System.out.println("Monster died. Its items are: " );
                    monster.printItemInfo(monster);
                    System.out.println("Would you like to pick them? yes/no");

                    String tempanswer = scanner.nextLine();

                    if(tempanswer.equals("yes") && hero.getStorage() > 0){

                        hero.setStorage(hero.getStorage()-monster.weapon.getWeight());
                        hero.setWeapon(monster.getWeapon());
                        System.out.println("your are : ");
                        hero.printItemInfo(hero);

                    }

                    else{
                        System.out.println("you didnt pick this item");
                        break;
                    }

                }

                /*else if (monster.getHealth() <= 0){
                    System.out.println("You have chosen not to pick up the item");
                    break;
                }*/


            }



            else {
                System.out.println("you decided not to attack");
                break;
            }


        }
    }

}
