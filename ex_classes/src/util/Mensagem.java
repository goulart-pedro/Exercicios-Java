package util;

/**
 * Mensagem
 */
public class Mensagem {
    public Mensagem() {
    };

    public Mensagem(String nomeSender, String txtMensagem) {
        this.nomeSender = nomeSender;
        this.txtMensagem = txtMensagem;
    }

    private String nomeSender;
    private String txtMensagem;

    public String getNomeSender() {
        return nomeSender;
    }

    public void setNomeSender(String nomeSender) {
        this.nomeSender = nomeSender;
    }

    public String getTxtMensagem() {
        return txtMensagem;
    }

    public void setTxtMensagem(String txtMensagem) {
        this.txtMensagem = txtMensagem;
    }

    @Override
    public String toString() {
        return "Mensagem [nomeSender=" + nomeSender + ", txtMensagem=" + txtMensagem + "]";
    }
}