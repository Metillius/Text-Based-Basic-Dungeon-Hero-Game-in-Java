public class Hero extends Character {

    Weapon The_Master_Sword;

    Scanner scanner = new Scanner(System.in);


    public Hero(){
        super();
    }

    @Override
    public void printCharacterInfo(){

        System.out.println("(Please enter a name)");
         String tempname = scanner.nextLine();
        setName(tempname);
        System.out.println("My name is " + getName()+ " I am the hero of this dungeon!");
        setHealth(100);
        System.out.println(getName()+" Health: "+getHealth());


    }

 
  
}
