package metodos;

import java.util.ArrayList;
import classes.Cliente;
import telas.janelaPrincipal.componentes.*;


public class ClienteOperacoes implements Metodos {

    ArrayList<Cliente> clientes = new ArrayList<>(); // array list que armazena os clientes

    // método para cadastrar um novo cliente
    @Override
    public void gravar () {
        //armazena o que foi digitado nos campos em variáveis
        String nomeDigitado = CamposCliente.getNomeDigitado();
        String enderecoDigitado = CamposCliente.getEnderecoDigitado();
        String telefoneDigitado = CamposCliente.getTelefoneDigitado();
        String cpfDigitado = CamposCliente.getCpfDigitado();

        // cria um novo objeto cliente e armazena as informações com os métodos set
        Cliente novoCliente = new Cliente(null,null,null,null);
        novoCliente.setNome(nomeDigitado);
        novoCliente.setEndereco(enderecoDigitado);
        novoCliente.setTelefone(telefoneDigitado);
        novoCliente.setCpf(cpfDigitado);

        clientes.add(novoCliente); // adiciona o novo cliente no array list
        System.out.println("Cliente cadastrado com sucesso.");
        System.out.println("Nome: "+ novoCliente.getNome() +"\nEndereço: " + novoCliente.getEndereco() + "\nTelefone: "+ novoCliente.getTelefone() +"\nCPF: " + novoCliente.getCpf());
        
    }

    //método para editar um cliente
    @Override
    public void editar () {

        // armazena o que foi digitado nos campos em variáveis
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

        // edita as informações a partir dos métodos set
        clienteEncontrado.setNome(CamposCliente.getNomeDigitado());
        clienteEncontrado.setEndereco(CamposCliente.getEnderecoDigitado());
        clienteEncontrado.setTelefone(CamposCliente.getTelefoneDigitado());
        clienteEncontrado.setCpf(CamposCliente.getCpfDigitado());

        System.out.println("Cliente atualizado.");
        
    }

    //método para excluir um cliente
    @Override
    public void excluir () {
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

    //método para parar a execução
    @Override
    public void cancelar () {
        System.exit(0);
    }
}
