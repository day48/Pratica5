import java.awt.geom.Area;

  public class Triangulo  extends  PoligonoRegular{
      public Triangulo(int numLado,int tamLado) {
          super(numLado,numLado);
      }

      @Override
      public float calcularArea() {
          return  getTamLado()* getNumLados();
      }

  }



