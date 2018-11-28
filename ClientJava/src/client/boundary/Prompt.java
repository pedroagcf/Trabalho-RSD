package src.client.boundary;

import src.client.control.ControlProxyCliente;
import src.client.control.ControlProxyCorrida;
import src.client.control.ControlProxyMototaxi;
import src.client.control.ControlTCPClient;

import java.util.Scanner;

public class Prompt {
    private int port =7896;
    private String ip = "localhost";
    private ControlProxyCliente controlProxyCliente;
    private ControlProxyMototaxi controlProxyMototaxi;
    private ControlProxyCorrida controlProxyCorrida;
    private ControlTCPClient controlTCPClient;
    private Scanner input;

    public void run() {
        this.controlTCPClient = new ControlTCPClient(this.ip, this.port);
        this.controlProxyCliente = new ControlProxyCliente(this.controlTCPClient);
        this.controlProxyMototaxi = new ControlProxyMototaxi(controlTCPClient);
        this.controlProxyCorrida = new ControlProxyCorrida(controlTCPClient);
        this.input = new Scanner(System.in);

        boolean end = true;
        System.out.println("Bem Vindo ao Sistema de Gerencimento de Clientes, Mototaxis e Corridas.");

        while(end) {
            System.out.println("\nSelecione: ");
            System.out.println("1- Gerenciar Clientes");
            System.out.println("2- Gerenciar Mototaxis");
            System.out.println("3- Gerenciar Corridas");
            System.out.println("0- Sair do Sistema");
            System.out.print(">> ");

            int comando = Integer.parseInt(input.nextLine());

            switch (comando) {
                case 0: end=!end; break;
                case 1: promptClient(); break;
                case 2: promptMototaxi(); break;
                case 3: promptCorridas(); break;
                default: break;
            }
        }
        System.out.println("Programa Finalizado!");
        controlProxyCliente.close();
        controlProxyMototaxi.close();
    }

    private void promptClient() {
        boolean end = true;

        while(end) {
            System.out.println("\nSelecione: ");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Editar Cliente");
            System.out.println("3- Remover Cliente");
            System.out.println("4- Listar Clientes");
            System.out.println("0- Voltar ao Menu Anterior");
            System.out.print(">> ");

            int comando = Integer.parseInt(input.nextLine());

            switch (comando) {
                case 0: end=!end; break;
                case 1: cadastrarCliente(); break;
                case 2: editarCliente(); break;
                case 3: removerCliente(); break;
                case 4: listarCliente(); break;
                default: break;
            }
        }
    }

    public void cadastrarCliente() {
        System.out.print("Insira um Id para o Cliente: ");
        int idCliente = Integer.parseInt(input.nextLine());

        System.out.print("Insira o nome do Cliente: ");
        String nome = input.nextLine();

        System.out.print("Insira o telefone do Cliente: ");
        String telefone = input.nextLine();

        String retorno = this.controlProxyCliente.cadastrar(idCliente, nome, telefone);
        System.out.println('\n'+retorno);
    }

    public void editarCliente() {
        System.out.print("Insira um Id do Cliente a ser editado: ");
        int idCliente = Integer.parseInt(input.nextLine());

        System.out.print("Insira o novo nome do Cliente: ");
        String nome = input.nextLine();

        System.out.print("Insira o novo telefone do Cliente: ");
        String telefone = input.nextLine();

        String retorno = this.controlProxyCliente.editar(idCliente, nome, telefone);
        System.out.println('\n'+retorno);
    }

    public void removerCliente() {
        System.out.print("Insira um Id do Cliente a ser removido: ");
        int idCliente = Integer.parseInt(input.nextLine());

        String retorno = this.controlProxyCliente.remover(idCliente);
        System.out.println('\n'+retorno);
    }

    public void listarCliente() {
        System.out.println(this.controlProxyCliente.listar().values());
    }

    private void promptMototaxi() {
        boolean end = true;

        while(end) {
            System.out.println("\nSelecione: ");
            System.out.println("1- Cadastrar Mototaxi");
            System.out.println("2- Editar Mototaxi");
            System.out.println("3- Remover Mototaxi");
            System.out.println("4- Listar Mototaxis");
            System.out.println("0- Voltar ao Menu Anterior");
            System.out.print(">> ");

            Scanner input = new Scanner(System.in);
            int comando = Integer.parseInt(input.nextLine());

            switch (comando) {
                case 0: end=!end; break;
                case 1: cadastrarMototaxi(); break;
                case 2: editarMototaxi(); break;
                case 3: removerMototaxi(); break;
                case 4: listarMototaxi(); break;
                default: break;
            }
        }
    }

    public void cadastrarMototaxi() {
        System.out.print("Insira um Id para o Mototaxi: ");
        int idMototaxi = Integer.parseInt(input.nextLine());

        System.out.print("Insira o nome do Mototaxi: ");
        String nome = input.nextLine();

        System.out.print("Insira o telefone do Mototaxi: ");
        String telefone = input.nextLine();

        System.out.print("Insira a praca onde o Mototaxi trabalha: ");
        String praca = input.nextLine();

        String retorno = this.controlProxyMototaxi.cadastrar(idMototaxi, nome, telefone, praca);
        System.out.println('\n'+retorno);
    }

    public void editarMototaxi() {
        System.out.print("Insira um Id do Mototaxi a ser editado: ");
        int idMototaxi = Integer.parseInt(input.nextLine());

        System.out.print("Insira o novo nome do Mototaxi: ");
        String nome = input.nextLine();

        System.out.print("Insira o novo telefone do Mototaxi: ");
        String telefone = input.nextLine();

        System.out.print("Insira a praca onde o Mototaxi trabalha: ");
        String praca = input.nextLine();

        String retorno = this.controlProxyMototaxi.editar(idMototaxi, nome, telefone, praca);
        System.out.println('\n'+retorno);
    }

    public void removerMototaxi() {
        System.out.print("Insira um Id do Mototaxi a ser removido: ");
        int idMototaxi = Integer.parseInt(input.nextLine());

        String retorno = this.controlProxyMototaxi.remover(idMototaxi);
        System.out.println('\n'+retorno);
    }

    public void listarMototaxi() {
        System.out.println(this.controlProxyMototaxi.listar().values());
    }

    private void promptCorridas() {
        boolean end = true;

        while(end) {
            System.out.println("Selecione: ");
            System.out.println("1- Solicitar corrida");
            System.out.println("2- Encerrar corrida");
            System.out.println("3- Exibir corridas ativas");
            System.out.println("0- Voltar ao Menu Anterior");
            System.out.print(">> ");
            int idMototaxi, idCliente;
            Scanner input = new Scanner(System.in);
            int comando = Integer.parseInt(input.nextLine());

            switch (comando) {
                case 0: end=!end; break;
                case 1:

                    System.out.print("Insira um Id do Mototaxi a ser solicitado: ");
                    idMototaxi = Integer.parseInt(input.nextLine());

                    System.out.print("Insira um Id do Cliente que irá realizar a corrida: ");
                    idCliente = Integer.parseInt(input.nextLine());

                    System.out.println(this.controlProxyCorrida.iniciarCorrida(idCliente, idMototaxi));

                    break;

                case 2:

                    System.out.print("Insira um Id do Mototaxi que está em corrida: ");
                    idMototaxi = Integer.parseInt(input.nextLine());

                    System.out.print("Insira um Id do Cliente que está na corrida: ");
                    idCliente = Integer.parseInt(input.nextLine());

                    System.out.println(this.controlProxyCorrida.encerrarCorrida(idCliente, idMototaxi));

                    break;

                case 3:

                    System.out.println(this.controlProxyCorrida.listar().values());



                    break;
                default: break;
            }
        }
    }
}
