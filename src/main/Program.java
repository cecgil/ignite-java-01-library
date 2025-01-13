package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		

//                case 1:
//                    System.out.print("Digite o ID do livro: ");
//                    Integer novoIdLivro = scanner.nextInt();
//                    System.out.print("Digite o nome do livro: ");
//                    String novoNomeLivro = scanner.nextLine();
//                    System.out.print("Digite o id do autor: ");
//                    Integer idAutor = scanner.nextInt();
//                    Autor autor = biblioteca.buscarAutorPorId(idAutor);
//                    Livro novoLivro = new Livro(novoIdLivro, novoNomeLivro, autor != null ? autor.getNome() : "");
//                    biblioteca.adicionarLivro(novoLivro);
//                    System.out.println("Livro adicionado com sucesso!");
//                    break;

 
		while (true) {
		    System.out.println("Deseja ver os livros disponíveis? (sim/nao)");
		    System.out.println("Deseja cadastrar um novo livro? (cadastro)");
		    String resposta = scanner.nextLine().toLowerCase();

		    if (resposta.equals("sim")) {
		        List<Livro> livrosDisponiveis = biblioteca.listarLivrosDisponiveis();

		        if (livrosDisponiveis.isEmpty()) {
		            System.out.println("Não há livros disponíveis no momento.");
		        } else {
		            System.out.println("Livros disponíveis:");
		            for (Livro livro : livrosDisponiveis) {
		                System.out.println(livro.getId() + ": " + livro.getTitulo());
		            }

		            System.out.println("Digite o ID do livro que você deseja emprestar:");
		            int idLivro = scanner.nextInt();
		            scanner.nextLine();  // Consumir a quebra de linha pendente

		            Livro livroSelecionado = biblioteca.buscarLivroPorId(idLivro);

		            if (livroSelecionado != null && livroSelecionado.isDisponivel()) {
		                System.out.println("Digite seu nome:");
		                String nomeUsuario = scanner.nextLine();

		                biblioteca.emprestarLivros(livroSelecionado, nomeUsuario);
		                System.out.println("O livro " + livroSelecionado.getTitulo() + " foi emprestado para " + nomeUsuario);
		            } else {
		                System.out.println("Livro não encontrado ou não disponível para empréstimo.");
		            }
		        }
		    } else if (resposta.equals("nao")) {
		        System.out.println("Obrigado por utilizar o sistema da biblioteca.");
		        break;
		    } else if (resposta.equals("cadastro")) {
		        System.out.println("Digite o ID do livro: ");
		        int novoIdLivro = scanner.nextInt();
		        scanner.nextLine();  // Consumir a quebra de linha pendente

		        System.out.println("Digite o nome do livro: ");
		        String novoNomeLivro = scanner.nextLine();

		        System.out.println("Digite o ID do autor: ");
		        int idAutor = scanner.nextInt();
		        scanner.nextLine();  // Consumir a quebra de linha pendente

		        Autor autor = biblioteca.buscarAutorPorId(idAutor);
		        Livro novoLivro = new Livro(novoIdLivro, novoNomeLivro, autor != null ? autor.getNome() : "");
		        biblioteca.adicionarLivro(novoLivro);
		        System.out.println("Livro adicionado com sucesso!");
		    } else {
		        System.out.println("Resposta inválida. Por favor, responda com 'sim', 'não' ou 'cadastro'.");
		    }
		}


        scanner.close();
    }
}
