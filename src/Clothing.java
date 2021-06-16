public class Clothing extends Item {



    public Clothing (String name, String rare){
        super(name,rare);
    }

    public static Clothing Fabric_Armour(){
        Clothing Fabric_Armour = new Clothing("Fabric Armour","Very Rare");
        return Fabric_Armour;
    }

    public static Clothing Rigid_Armour() {
        Clothing Rigid_Armour = new Clothing ("Rigid Armour","Common");
        return Rigid_Armour;
    }

    public static Clothing Horn_Armour(){
        Clothing Horn_Armour = new Clothing("Horn Armour","Common");
        return Horn_Armour;
    }

    public static Clothing Wood_Armour(){
        Clothing Wood_Armour = new Clothing("Wood Armour","Legendary");
        return Wood_Armour;
    }

    public static Clothing Plastic_Armour(){
        Clothing Plastic_Armour = new Clothing("Plastic Armour","Legendary Rare");
        return Plastic_Armour;
    }

}

