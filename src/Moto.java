public class Moto extends Vehicule
{
    @Override
    public String toString() {
        return String.format("Cette Moto a " + getNbrRoues() + " roues, un carburant de type " + getTypeCarburant() + ", une vitesse max de " + getVitesseMax() + " km/h, une contenance de reservoir de " + getContenanceReservoir() + " et un contenu reservoir de " + getContenuReservoir());
    }

    public Moto() {
        this.contenanceReservoir = 30;
        this.contenuReservoir = 0;
        this.nbrRoues = 2;
        this.typeCarburant = "Essence";
        this.vitesseMax = 320;
    }
}
