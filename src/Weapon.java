public class Weapon extends Item {


    public Weapon(String name, int weight,double value, int damage,int range){
        super(name,weight,value,damage,range);
    }



    public static Weapon Old_Sword(){
        Weapon Old_Sword = new Weapon("Old Sword",3,6,4,1);
        return Old_Sword;
    }
    public static Weapon Travellers_Sword(){
        Weapon Travellers_Sword = new Weapon("Travellers Sword",4,16,6,1);
        return Travellers_Sword;
    }
    public static Weapon Claymore(){
        Weapon Claymore = new Weapon("Claymore",7,38,8,2);
        return Claymore;
    }
    public static Weapon The_Master_Sword(){
        Weapon The_Master_Sword = new Weapon("The Master Sword",5,38,8,2);
        return The_Master_Sword;
    }

    public static Weapon Woodcutter_Axe(){
        Weapon Woodcutter_Axe = new Weapon("Woodcutter Axe",6,12,5,2);
        return Woodcutter_Axe;
    }
    public static Weapon Double_Axe(){
        Weapon Double_Axe = new Weapon("Double Axe",8,26,7,2);
        return Double_Axe;
    }
    public static Weapon Wooden_Bow(){
        Weapon Wooden_Bow = new Weapon("Wooden Bow",3,14,2,3);
        return Wooden_Bow;
    }
    public static Weapon Elven_Bow(){
        Weapon Elven_Bow = new Weapon("Elven Bow",2,27,3,3);
        return Elven_Bow;
    }
    public static Weapon Dragobone_Bow(){
        Weapon Dragobone_Bow = new Weapon("Dragobone Bow",7,47,4,3);
        return Dragobone_Bow;
    }
}
