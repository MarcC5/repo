public class Covid_19 extends Coronavirus {
    
    private int diesDeQuarentena;
    
    // Constructor buid
    public Covid_19(){
        super();
        this.diesDeQuarentena = 14;
    }
    
    // Constructor per parametres
    public Covid_19(float x, float y, int diesDeQuarentena){
        super(x, y);
        this.diesDeQuarentena = diesDeQuarentena;
    }
    
    // Constructor copiador
    public Covid_19(Covid_19 cov){
        super(cov);
        this.diesDeQuarentena = cov.diesDeQuarentena;
    }

    @Override
    public String toString() {
        return "Covid_19{" + "diesDeQuarentena=" + diesDeQuarentena + '}';
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
        final Covid_19 other = (Covid_19) obj;
        if (this.diesDeQuarentena != other.diesDeQuarentena) {
            return false;
        }
        return true;
    }

    public int getDiesDeQuarentena() {
        return diesDeQuarentena;
    }

    public void setDiesDeQuarentena(int diesDeQuarentena) {
        this.diesDeQuarentena = diesDeQuarentena;
    }

}