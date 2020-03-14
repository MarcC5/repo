public class Coronavirus {
    private float infeccio;
    private float mortalitat;
    
    // Constructor buid
    public Coronavirus(){
        this.infeccio = 0;
        this.mortalitat = 0;
    }
    
    // Constructor per parametres
    public Coronavirus(float x, float y){
        this.infeccio = x;
        this.mortalitat = y;
    }
    
    // Construcot copiador
    public Coronavirus(final Coronavirus c){
        this.infeccio = c.infeccio;
        this.mortalitat = c.mortalitat;
    }

    @Override
    public String toString() {
        return "Coronavirus{" + "infeccio=" + infeccio + ", mortalitat=" + mortalitat + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coronavirus other = (Coronavirus) obj;
        if (Float.floatToIntBits(this.infeccio) != Float.floatToIntBits(other.infeccio)) {
            return false;
        }
        if (Float.floatToIntBits(this.mortalitat) != Float.floatToIntBits(other.mortalitat)) {
            return false;
        }
        return true;
    }
	
    public float getInfeccio() {
        return infeccio;
    }

    public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public float getMortalitat() {
        return mortalitat;
    }

    public void setMortalitat(float mortalitat) {
        this.mortalitat = mortalitat;
    }
    
    
}