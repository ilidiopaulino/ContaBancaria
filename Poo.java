package poo;

public class Poo {

    public static void main(String[] args) {

        ContaBancaria contBanc = new ContaBancaria();
        contBanc.setDono("creusa");
        contBanc.setNumConta(1234567891);
        contBanc.setSaldo(500);
        contBanc.setTipo("cc");
        contBanc.status();
        System.out.println("\n");

        contBanc.abrirConta();
        System.out.println(contBanc.depositar(50));
        System.out.println(contBanc.pagarMensal());
        System.out.println(contBanc.sacar(30));
        System.out.println(contBanc.fecharConta());
        contBanc.status();
        System.out.println("\n");

        ContaBancaria contBanc2 = new ContaBancaria();
        contBanc2.setStats(true);
        contBanc2.setDono("joao");
        contBanc2.setNumConta(52848951);
        contBanc2.setSaldo(300);
        contBanc2.setTipo("cp");
        contBanc2.status();
        System.out.println("\n");

        contBanc.abrirConta();
        System.out.println(contBanc2.depositar(50));
        System.out.println(contBanc2.pagarMensal());
        System.out.println(contBanc2.sacar(30));
        System.out.println(contBanc2.fecharConta());
        contBanc2.status();
    }

}
