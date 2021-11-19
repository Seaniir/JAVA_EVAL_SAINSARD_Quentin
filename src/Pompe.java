public class Pompe
{
    private String typeCarburant;
    private float contenance;
    private float contenu;

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public float getContenance() {
        return contenance;
    }

    public float getContenu() {
        return contenu;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public void setContenance(float contenance) {
        this.contenance = contenance;
    }

    public void setContenu(float contenu) {
        this.contenu = contenu;
    }

    public Pompe(String typeCarburant, float contenance, float contenu) {
        this.typeCarburant = typeCarburant;
        this.contenance = contenance;
        this.contenu = contenu;
    }

    @Override
    public String toString()
    {
        return String.format("Cette pompe contient du " + getTypeCarburant() + ", elle peut contenir " + getContenance() + "L et en contient actuellement " + getContenu() + "L");
    }
}
