package br.com.prova00;
import  java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public abstract class Convite { //cria uma classe abstrata com 3 atributos
    String timeStamp;
    String usuario;
    String mensagem;

    public Convite( String usuario, String mensagem) { // cria um construtor com 2 atributos mais  data e hora corrente
        this.timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getdataEnvio(){
        return timeStamp;
    }
    public  abstract  String mostrar (); // cria metodo abstrato
}
