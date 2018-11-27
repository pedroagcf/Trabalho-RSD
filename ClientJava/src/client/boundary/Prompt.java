package client.boundary;

import java.util.Scanner;

public class Prompt {
//    ControlProxyCalc controlProxyCalc;
//
//    public void startChat() {
//        controlProxyCalc = new ControlProxyCalc();
//
//        Double result;
//
//        this.showStartMessage();
//
//        while (true) {
//            result = this.controlProxyCalc.getOperationResult(this.writeMessage());
//            if (result == null) {
//                this.showResult("Houve um erro! Verique as operações disponíveis.");
//                System.out.println("Operações Disponíveis: sum, sub, mul, div. \n");
//            } else {
//                this.showResult(""+result);
//            }
//        }
//    }
//
//    public void showStartMessage() {
//        System.out.println("***Calculadora Cliente/Servidor***");
//        System.out.println("Operações Disponíveis: sum, sub, mul, div. \n");
//    }
//
//    public String writeMessage() {
//        System.out.print("Insira uma Operação - Ex. sum(1,2): ");
//        Scanner input = new Scanner(System.in);
//        return input.nextLine();
//    }
//
//    public void showResult(String result) {
//        System.out.println("Resultado: " + result);
//    }

//    public class Main {
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//
//            UsuarioDAO userDAO = new UsuarioDAO();
//            LivroDAO livroDAO = new LivroDAO();
//            AlocacaoDAO alocDAO = new AlocacaoDAO();
//
//            int option;
//
//            Scanner scanner = new Scanner(System.in);
//
//            boolean end = false;
//
//            while(!end) {
//
//                System.out.println(app_name);
//                System.out.println("| 1 | Cadastrar cliente");
//                System.out.println("| 2 | Editar cliente");
//                System.out.println("| 3 | Remover cliente");
//                System.out.println("| 4 | Listar cliente");
//                System.out.println("| 5 | Cadastrar Mototaxi");
//                System.out.println("| 6 | Editar Mototaxi");
//                System.out.println("| 7 | Remover Mototaxi");
//                System.out.println("| 8 | Listar Mototaxi");
//
//                option = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (option){
//                    case 1:{
//
//                        String nome, email, endereco;
//                        System.out.println("Digite o nome do usuario:");
//                        nome = scanner.nextLine();
//                        System.out.println("Digite a email do usuario:");
//                        email = scanner.nextLine();
//                        System.out.println("Digite o endereço do usuario:");
//                        endereco = scanner.nextLine();
//
//                        Usuario user = new Usuario(nome, email, endereco);
//                        if(userDAO.addUser(user)) {
//                            System.out.println("Inserido com sucesso!");
//                        }else {
//                            System.err.println("Erro ao inserir o usuário.");
//                        }
//                        break;
//                    }case 2:{
//                        ArrayList<Usuario> userList = userDAO.getListUser();
//                        for(Usuario user : userList){
//                            System.out.println(user.toString());
//                        }
//                        break;
//                    }case 3:{
//                        System.out.println("Digite o ID do usuário que deseja apagar:");
//                        int id = scanner.nextInt();
//                        if(userDAO.deleteUser(id)) {
//                            System.out.println("Deletado com sucesso!");
//                        }else {
//                            System.err.println("Erro ao deletar o usuário.");
//                        }
//                    }case 4:{
//                        String titulo, autor, editora;
//                        System.out.println("Digite o titulo do livro:");
//                        titulo = scanner.nextLine();
//                        System.out.println("Digite a editora do livro:");
//                        editora = scanner.nextLine();
//                        System.out.println("Digite o autor:");
//                        autor = scanner.nextLine();
//
//                        Livro livro = new Livro(titulo, editora, autor);
//
//                        livroDAO.addLivro(livro);
//                        break;
//                    }case 5:{
//                        int idLivro, idUsuario;
//                        System.out.println("Digite o ID do usuário:");
//                        idUsuario = scanner.nextInt();
//                        System.out.println("Digite o ID do livro:");
//                        idLivro = scanner.nextInt();
//
//                        Usuario user = userDAO.getUserById(idUsuario);
//                        Livro livro = livroDAO.getLivroById(idLivro);
//
//                        alocDAO.alocar(livro, user);
//
//                        break;
//                    }case 6:{
//                        ArrayList<Alocacao> listAloc = alocDAO.getListAlocacao();
//                        for(Alocacao aloc : listAloc){
//                            System.out.println(aloc.getUsuario().getNome() + " alocou o livro " + aloc.getLivro().getTitulo());
//                        }
//                        break;
//                    }case 7:{
//                        /**
//                         *
//                         * Este caso é apenas para testes.
//                         *
//                         */
//                        System.out.println("aaaa");
//                        double val1 = scanner.nextDouble();
//                        double val2 = scanner.nextDouble();
//                        System.out.println(val1 + " e " + val2);
//
//                        int i1 = scanner.nextInt();
//                        int i2 = scanner.nextInt();
//                        scanner.nextLine();//Pega o que tiver no buffer. no caso, uma quebra de linha
//                        String value = scanner.nextLine();
//                        System.out.println(value + " = " + i1 + ", " + i2);
//
//                    }default:
//                        end = true;
//                        break;
//                }
//            }
//        }
//
//    }

}
