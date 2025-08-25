package metodos;

import classes.Cliente;
import classes.Conta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telas.janelaPrincipal.componentes.*;


public class ClienteOperacoes implements Metodos {

    ArrayList<Cliente> clientes = new ArrayList<>(); // array list que armazena os clientes

    // método para cadastrar um novo cliente
    @Override
    public void gravar() {
        //armazena o que foi digitado nos campos em variáveis
        String agenciaDigitada = CamposConta.getAgenciaDigitada();
        String numeroContaDigitado = CamposConta.getNumeroContaDigitado();
        String nomeDigitado = CamposCliente.getNomeDigitado();
        String enderecoDigitado = CamposCliente.getEnderecoDigitado();
        String telefoneDigitado = CamposCliente.getTelefoneDigitado();
        String cpfDigitado = CamposCliente.getCpfDigitado();

        // verificacao de input
        if (CamposConta.getAgenciaDigitada().isEmpty() || CamposConta.getNumeroContaDigitado().isEmpty() || CamposCliente.getNomeDigitado().isEmpty() || CamposCliente.getEnderecoDigitado().isEmpty() || CamposCliente.getTelefoneDigitado().isEmpty() || CamposCliente.getCpfDigitado().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // cria um novo objeto cliente e um objeto conta e armazena as informações com os métodos set
        Conta novaConta = new Conta(null, null, 0);
        Cliente novoCliente = new Cliente(null,null,null,null, novaConta);
        novoCliente.setNome(nomeDigitado);
        novoCliente.setEndereco(enderecoDigitado);
        novoCliente.setTelefone(telefoneDigitado);
        novoCliente.setCpf(cpfDigitado);
        novaConta.setAgencia(agenciaDigitada);
        novaConta.setNumero(numeroContaDigitado);

        clientes.add(novoCliente); // adiciona o novo cliente no array list
        JOptionPane.showMessageDialog(null, "Dados registrados.");
        System.out.println("Cliente cadastrado com sucesso.\n");
        System.out.println("Agência: "+ novaConta.getAgencia() +"\nNúmero da Conta: " + novaConta.getNumero() + "\nNome: "+ novoCliente.getNome() +"\nEndereço: " + novoCliente.getEndereco() + "\nTelefone: "+ novoCliente.getTelefone() +"\nCPF: " + novoCliente.getCpf());
        
    }

    //método para editar um cliente
    @Override
    public void editar() {

        // armazena o que foi digitado nos campos em variáveis
        String agenciaDigitada = CamposConta.getAgenciaDigitada();
        String numeroContaDigitado = CamposConta.getNumeroContaDigitado();

        // verificacao de input
        if (CamposCliente.getNomeDigitado().isEmpty() || CamposCliente.getEnderecoDigitado().isEmpty() || CamposCliente.getTelefoneDigitado().isEmpty() || CamposCliente.getCpfDigitado().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Cliente clienteEncontrado = null;
        // loop para encontrar o cliente com a agencia e numero da conta digitados
        for (Cliente c : clientes){
            if (c.getConta().getAgencia().equals(agenciaDigitada) && c.getConta().getNumero().equals(numeroContaDigitado)){
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null){
            System.out.println("Cliente não encontrado");
            return;
        }

        // edita as informações a partir dos métodos set
        clienteEncontrado.setNome(CamposCliente.getNomeDigitado());
        clienteEncontrado.setEndereco(CamposCliente.getEnderecoDigitado());
        clienteEncontrado.setTelefone(CamposCliente.getTelefoneDigitado());
        clienteEncontrado.setCpf(CamposCliente.getCpfDigitado());

        JOptionPane.showMessageDialog(null, "Dados atualizados.");
        System.out.println("Cliente atualizado.\n");
        System.out.println("Nome: "+ clienteEncontrado.getNome() +"\nEndereço: " + clienteEncontrado.getEndereco() + "\nTelefone: "+ clienteEncontrado.getTelefone() +"\nCPF: " + clienteEncontrado.getCpf());
        
    }

    //método para excluir um cliente
    @Override
    public void excluir() {
        //armazena o que foi digitado nos campos em variáveis
        String agenciaDigitada = CamposConta.getAgenciaDigitada();
        String numeroContaDigitado = CamposConta.getNumeroContaDigitado();

        Cliente clienteEncontrado = null;
        // loop para encontrar o cliente com a agencia e numero da conta digitados
        for (Cliente c : clientes) {
            if (c.getConta().getAgencia().equals(agenciaDigitada) && c.getConta().getNumero().equals(numeroContaDigitado)){
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null){
            System.out.println("Cliente não encontrado");
            return;
        }

        // remove o cliente do array list
        clientes.remove(clienteEncontrado);
        System.out.println("Cliente excluído.");
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
}
