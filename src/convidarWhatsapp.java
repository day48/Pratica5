import br.com.prova00.Convite;

public class convidarWhatsapp extends Convite { //cria uma classe herda Convite mais um atributo
    String telefone;

    public convidarWhatsapp(String usuario, String mensagem, String telefone) { //cria construtor 2 atributos da mae e um da filha
        super(usuario, mensagem);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String mostrar (){ // implementa um metodo mostrar que retorna uma string concatenada através dos metodos get
        return "Usuario: " + getUsuario()+"\n Data Envio:"+ getdataEnvio()+"\n Mensagem:"+ getMensagem() +"\n Telefone: " + getTelefone();
    }
    }




