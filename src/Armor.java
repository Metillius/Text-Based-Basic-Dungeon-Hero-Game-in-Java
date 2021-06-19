public class Armor extends Item {



    public Armor (String name, int protection, double value,int weight){
        super(name,protection,value,weight);
    }

    public static Armor leatherArmor(){
        Armor LeatherArmor = new Armor("Leather Armor",1 , 10,3);
        return LeatherArmor;
    }

    public static Armor ironArmor() {
        Armor IronArmor = new Armor ("Iron Armor", 2, 20,5);
        return IronArmor;
    }

    public static Armor ebonyArmor(){
        Armor EbonyArmor = new Armor("Ebony Armor",3 , 30,4 );
        return EbonyArmor;
    }


}
