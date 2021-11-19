public class MainExo2
{

    public static void main(String[] args)
    {
        Voiture voiture = new Voiture();
        Moto moto = new Moto();
        System.out.println(voiture.toString());
        System.out.println(moto.toString());
        Pompe pompe1 = new Pompe("Essence", 250, 125);
        System.out.println(pompe1.toString());
        voiture.fairePlein(pompe1);
        System.out.println(voiture.toString());
        System.out.println(pompe1.toString());
        Pompe pompe2 = new Pompe("Essence", 250, 27);
        System.out.println(pompe2.toString());
        moto.fairePlein(pompe2);
        System.out.println(moto.toString());
        System.out.println(pompe2.toString());
    }
}
