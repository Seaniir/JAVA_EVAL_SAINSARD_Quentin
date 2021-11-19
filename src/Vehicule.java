public abstract class Vehicule
{
    protected int nbrRoues;
    protected String typeCarburant;
    protected float vitesseMax;
    protected float contenanceReservoir;
    protected float contenuReservoir;

    protected int getNbrRoues() {
        return nbrRoues;
    }

    protected String getTypeCarburant() {
        return typeCarburant;
    }

    protected float getVitesseMax() {
        return vitesseMax;
    }

    public float getContenanceReservoir() {
        return contenanceReservoir;
    }

    public float getContenuReservoir() {
        return contenuReservoir;
    }

    protected float fairePlein(Pompe pompe)
    {
        if (pompe.getTypeCarburant() == this.typeCarburant) {
            if (pompe.getContenu() >= this.contenanceReservoir && this.contenuReservoir < this.contenanceReservoir) {
                this.contenuReservoir = this.contenanceReservoir;
                pompe.setContenu(pompe.getContenu() - this.contenuReservoir);
            }
            else
            {
                this.contenuReservoir = pompe.getContenu();
                pompe.setContenu(0);
            }
        }
        else
        {
            System.out.println("Le type de carburant n'est pas le même ! Impossible de faire le plein");
        }

        return 0;
    }

    @Override
    public abstract String toString();
}
