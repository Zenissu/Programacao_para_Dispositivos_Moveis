import java.util.Scanner;

public class ContaCorrente {
    // 21 - Crie uma classe chamada ContaCorrente com métodos para depósito, saque e transferência.

    public static Scanner scanner = new Scanner(System.in);
    float saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        float valorDeposito;

        System.out.println("O valor atual na conta: " + this.getSaldo());

        System.out.println("Escreva o valor do deposito: ");
        valorDeposito = (float) Verificador.numero();

        if (valorDeposito > 0) {
            valorDeposito = this.getSaldo() + valorDeposito;
            this.setSaldo(valorDeposito);
            System.out.println("Valor após o deposito: " + this.getSaldo());
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar() {
        float sacar;

        System.out.println("O valor atual na conta: " + this.getSaldo());

        System.out.println("Escreva o valor do saque: ");
        sacar = (float) Verificador.numero();

        if (sacar <= this.getSaldo()) {
            if (sacar > 0) {

                sacar = this.getSaldo() - sacar;
                this.setSaldo(sacar);

                System.out.println("Valor após o deposito: " + this.getSaldo());

            } else {

                System.out.println("O valor do saque deve ser positivo.");

            }
        } else {
            System.out.println("A conta corrente possui saldo negativo ou valor menor ao saque requisitado.");
        }
    }

    public void transferir(ContaCorrente contaDestino) {
        float transferencia;

        System.out.println("O valor atual na conta: " + this.getSaldo());

        System.out.println("Escreva o valor da transferencia: ");
        transferencia = (float) Verificador.numero();

        if (transferencia < this.getSaldo() && transferencia > 0) {

            this.setSaldo(this.getSaldo() - transferencia);
            contaDestino.setSaldo(contaDestino.getSaldo() + transferencia);

            System.out.println("Valor após a transferencia: " + this.getSaldo());

        } else {
            System.out.println("A conta corrente possui saldo negativo ou saldo insuficiente a transferencia requisitada.");
        }
    }
}

