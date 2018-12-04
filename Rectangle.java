package GroupeTP1;

public class Rectangle {
    float cote1; //longueur
    float cote2; //largueur


    public Rectangle(float cote1,float cote2) {
        this.cote1 = cote1;
        this.cote2 = cote2;
    }

    public float getAire() {
        return(cote1*cote2);
    }
}
