public class Principal {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da silva");
        titular1.setDocumento("121212123423");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("134343243");

        Conta minhaConta = new Conta(titular1, 123, 8898);
        Conta suaConta = new Conta(titular2, 123, 123343);

        minhaConta.depositar(15_000);
        suaConta.depositar(30_000);

        minhaConta.sacar(100, 5);

        System.out.println( "Titular: " + minhaConta.getTitular().getNome());
        System.out.println( "Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
   }

}
