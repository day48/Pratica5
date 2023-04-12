public class Quadrado  extends  PoligonoRegular {
    public Quadrado(int numLados, int tamLado) {
        super(numLados, tamLado);
    }

    @Override
    public float calcularArea() {
        return  getTamLado()* getNumLados();
    }



      }



