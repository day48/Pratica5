import java.awt.geom.Area;

public  abstract class PoligonoRegular{
   public  int numLados;
   public  int tamLado;

    public PoligonoRegular(int numLados, int tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public float getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(int tamLado) {
        this.tamLado = tamLado;
    }

    public  float calculaPerimetro(){
        return numLados*tamLado;
    }

    public abstract float  calcularArea() ;


}
