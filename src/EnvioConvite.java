import br.com.prova00.Convite;

public class EnvioConvite {
    public static void main(String[] args) {

        //Cria objetos do tipo conviteWhats e conviteEmail com atributos mocados e invoca o metodo mostrar de cada
        //Porem ao instanciar o objeto convite ocorre um erro pois a Classe convite e abstrata


        convidarWhatsapp conviteWhats = new convidarWhatsapp("Michelle", "Olá; hoje tem prova", "(31)985430198");
        System.out.println(conviteWhats.mostrar());
        System.out.println("*****");
        convidarEmail conviteEmail= new convidarEmail("Michelle","Olá,hoje tem prova", "michellehanne.andrade@gmail.com");
        System.out.println(conviteEmail.mostrar());
        System.out.println("*****");
        Convite convite = new Convite("Mchelle", "Olá,hoje tem prova");
        System.out.println(Convite.mostrar());

            }
        }

       // Convite é abstrato não pode ser instanciado.

