import br.com.prova00.Convite;

public class convidarEmail extends Convite { // cria uma classe herda Convite mais um atributo
    String email;

    public convidarEmail(String usuario, String mensagem, String email) { //cria construtor 2 atributos da mae e um da filha
        super(usuario, mensagem);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String mostrar(){ // implementa um metodo mostrar que retorna uma string concatenada através dos metodos get
        return "Usuario: " + getUsuario()+"\n Data Envio:"+ getdataEnvio()+"\n Mensagem:"+ getMensagem()+"\n E-mail: " + getEmail();
    }



}
