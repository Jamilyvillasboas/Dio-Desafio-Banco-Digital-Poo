public class Main {
    public static void main(String[] args) {

        Cliente Jamily = new Cliente();
        Jamily.setNome("Jamily");

        Conta cc = new ContaCorrente(Jamily);
        cc.depositar(100); 

        Conta poupanca = new ContaPoupanca(Jamily);

        cc.transferir(90, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
