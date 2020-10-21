
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cliente> cliente = new ArrayList<Cliente>(); 
		ArrayList<Classificacao> classificacao = new ArrayList<Classificacao>();
		ArrayList<Filme> filme = new ArrayList<Filme>();
		ArrayList<ClassificacaoFilme> classFilme = new ArrayList<ClassificacaoFilme>();
		ArrayList<ClienteFilme> clienteFilme = new ArrayList<ClienteFilme>();
		
		int op;
		
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("---------------------------------------------------------");
			System.out.println("1. Cadastrar Filme");
			System.out.println("2. Cadastrar Classificacao");
			System.out.println("3. Cadastar Cliente");
			System.out.println("4. Atribuir Classificacao ao Filme");
			System.out.println("5. Atribuir Cliente ao Filme");
			System.out.println("6. Listar Atribuicoes");
			System.out.println("0. Sair");
			System.out.println("---------------------------------------------------------");
			System.out.print("Opcao: ");
			op = Integer.parseInt(dados.readLine());
			
			switch(op) {
			
				case 1: {
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Filme");
					System.out.println("---------------------------------------------------------");
					int codigo = filme.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Titulo: ");
					String titulo = dados.readLine();
					System.out.print("Duracao:");
					int duracao = Integer.parseInt(dados.readLine());
					
					Filme f = new Filme();
					f.cadastrar(codigo, titulo, duracao);
					filme.add(f);
					
					break;
					
					}
				
				case 2: {
					
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Classificacao");
					System.out.println("---------------------------------------------------------");
					int codigo = filme.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Descricao: ");
					String descricao = dados.readLine();
					
					Classificacao c = new Classificacao();
					c.cadastrar(codigo, descricao);
					classificacao.add(c);
					
					break;
					
				}
				
				case 3: {
					
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Cliente");
					System.out.println("---------------------------------------------------------");
					int codigo = filme.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Nome: ");
					String nome = dados.readLine();
					System.out.print("Telefone:");
					String telefone = dados.readLine();
					System.out.print("Email:");
					String email = dados.readLine();
					
					
					Cliente cl = new Cliente();
					cl.cadastrar(codigo, nome, telefone, email);
					cliente.add(cl);
					
					break;
					
				}
				
				case 4: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Atribuir Classificacao ao Filme");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < classificacao.size(); x++)
						System.out.println(classificacao.get(x).mostrar());
					System.out.print("\nInforme o codigo da Classificacao: ");
					
					int codigoClass = Integer.parseInt(dados.readLine());	

					System.out.println("");
					
					for(int x = 0; x < filme.size(); x++)
						System.out.println(filme.get(x).mostrar());
					
					System.out.print("\nInforme o codigo do Filme: ");
					
					int codigoFilme = Integer.parseInt(dados.readLine());	
					
					classFilme.add(new ClassificacaoFilme(classificacao.get(codigoClass - 1), filme.get(codigoFilme - 1)));
					
					break;
				}
				
				case 5: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Atribuir Cliente ao Filme");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < cliente.size(); x++)
						System.out.println(cliente.get(x).mostrar());
					System.out.print("\nInforme o codigo do Cliente: ");
					
					int codigoCliente = Integer.parseInt(dados.readLine());	

					System.out.println("");
					
					for(int x = 0; x < filme.size(); x++)
						System.out.println(filme.get(x).mostrar());
					
					System.out.print("\nInforme o codigo do Filme: ");
					
					int codigoFilme = Integer.parseInt(dados.readLine());	
					
					clienteFilme.add(new ClienteFilme(cliente.get(codigoCliente - 1), filme.get(codigoFilme - 1)));
					
				}
				
				case 6: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Atribuicao");
					System.out.println("-------------------------------------------------");				
					
					for(int x = 0; x < clienteFilme.size(); x++)
						System.out.println("Cliente: " + clienteFilme.get(x).getCliente().getNome() 
								         + " | Filme: " + clienteFilme.get(x).getFilme().getTitulo());
					
					for(int x = 0; x < classFilme.size(); x++)
						System.out.println("Classificacao: " + classFilme.get(x).getClassificacao().getDescricao() 
								         + " | Filme: " + classFilme.get(x).getFilme().getTitulo());
					
					
					break;
					
					
				}
				
			} 
		}while (op > 0);
	}
}
