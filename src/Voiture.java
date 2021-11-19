public class Voiture extends Vehicule
{
    @Override
    public String toString() {
        return String.format("Cette Voiture a " + getNbrRoues() + " roues, un carburant de type " + getTypeCarburant() + ", une vitesse max de " + getVitesseMax() + " km/h, une contenance de reservoir de " + getContenanceReservoir() + " et un contenu reservoir de " + getContenuReservoir());
    }

    public Voiture() {
        this.contenanceReservoir = 50;
        this.contenuReservoir = 0;
        this.nbrRoues = 4;
        this.typeCarburant = "Diesel";
        this.vitesseMax = 250;
    }
}
