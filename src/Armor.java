public class Armor extends Item {

    //armor is an item



    public Armor (String name, int protection, double value,int weight){
        super(name,protection,value,weight);
    }

    //armor mantığı şöyle açıklanabilir ismi protectionu ve value su ve weighti var protection heroyu v monstrı hasardan koruyo ve verilen hasardan çıkarılıyo value hero alırsa scoruna ekleniyo weight de hero alırsa çantasında ağırlık oluşturmasını sağlıyo
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
