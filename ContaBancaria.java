package poo;

/**
 * @author IJIP productions
 */
public class ContaBancaria {

    private String dono;
    protected String tipo;
    private float saldo;
    public int numConta;
    private boolean stats;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    //cc -> conta corrente cp -> conta poupanca
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo += saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStats() {
        return stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }

    public void abrirConta() {
        //cc -> conta corrente cp -> conta poupanca
        this.setStats(true);
        if (this.tipo.equals("cc")) {
            this.saldo += 50;
        } else if (this.tipo.equals("cp")) {
            this.saldo += 150;
        }
    }

    public String fecharConta() {
        if (this.saldo == 0.0) {
            this.setStats(false);
            return "sem saldo e sua conta foi fechada!";
        } else if (this.saldo < 0) {
            return "conta nao pode ser fechada esta com saldo negativo!";
        } else {
            return "conta nao pode ser fechada esta com saldo positivo!";
        }
    }

    public String depositar(float saldo) {
        if (this.stats) {
            this.setSaldo(this.getSaldo() + saldo);
            return "deposito com sucesso!";
        } else {
            return "Conta fechada nao podes depositar";
        }
    }

    public String sacar(float sacar) {
        if (this.stats) {
            if (sacar > this.saldo) {
                return "seu saldo e inferior a:" + sacar;
            } else {
                this.saldo -= sacar;
            }
        } else {
            return "Conta fechada nao podes sacar";
        }
        return "";
    }

    public String pagarMensal() {
        //cc -> conta corrente cp -> conta poupanca
        float mesCC = 12, mesCp = 20;
        if (this.stats) {
            if (this.tipo.equals("cc") /*&& (this.saldo > mesCC*/) {
                this.saldo -= mesCC;
            } else if (this.tipo.equals("cp") /*&& (this.saldo > mesCp)*/) {
                this.saldo -= mesCp;
            }
        } else {
            return "conta fechada! nao podes pagar mensalidade";
        }
        return "";
    }

    public void status() {
        System.out.println("Proprietario: " + this.getDono());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Numero Conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo() + " $");
        System.out.println("Status: "+this.stats);

    }

    public ContaBancaria() {
        this.stats = false;
        this.saldo = 0.0f;
    }

}
