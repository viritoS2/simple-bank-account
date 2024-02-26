public class Conta {

    private double saldo=25;
    private int numeroDaConta=0;
    private int agencia = 0;
    private String nomeDoCliente="";



    public Conta(Double saldo, String nomeDoCliente, Integer numeroDaConta, Integer agencia){
        this.saldo = saldo;
        this.nomeDoCliente= nomeDoCliente;
        this.numeroDaConta = numeroDaConta;
        this.agencia= agencia;
    }
}
