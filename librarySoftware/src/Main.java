
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Clientes> cliente = new ArrayList<Clientes>(); 
		ArrayList<Categoria> categoria = new ArrayList<Categoria>();
		ArrayList<Livro> livro = new ArrayList<Livro>();
		ArrayList<CategoriaLivro> categoriaLivro = new ArrayList<CategoriaLivro>();
		ArrayList<ClienteLivro> clienteLivro = new ArrayList<ClienteLivro>();
		
		int op;
		
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("Menu - Gerenciamento de Biblioteca");
			System.out.println("---------------------------------------------------------");
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Cadastrar Categoria");
			System.out.println("3. Cadastar Cliente");
			System.out.println("4. Atribuir Categoria ao Livro");
			System.out.println("5. Atribuir Cliente ao Livro");
			System.out.println("6. Listar Atribuicoes");
			System.out.println("0. Sair");
			System.out.println("---------------------------------------------------------");
			System.out.print("Opcao: ");
			op = Integer.parseInt(dados.readLine());
			
			switch(op) {
			
				case 1: {
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Livro");
					System.out.println("---------------------------------------------------------");
					int codigo = livro.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Titulo: ");
					String titulo = dados.readLine();
					System.out.print("Paginas:");
					int paginas = Integer.parseInt(dados.readLine());
					
					Livro l = new Livro();
					l.cadastrar(codigo, titulo, paginas);
					livro.add(l);
					
					break;
					
					}
				
				case 2: {
					
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Categoria");
					System.out.println("---------------------------------------------------------");
					int codigo = categoria.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Descricao: ");
					String descricao = dados.readLine();
					System.out.println("Popularidade: ");
					int popularidade = Integer.parseInt(dados.readLine());
					
					Categoria c = new Categoria();
					c.cadastrar(codigo, descricao, popularidade);
					categoria.add(c);
					
					break;
					
				}
				
				case 3: {
					
					System.out.println("---------------------------------------------------------");
					System.out.println("Cadastrar Cliente");
					System.out.println("---------------------------------------------------------");
					int registro = cliente.size() + 1;
					System.out.println("Registro: " + registro);
					System.out.print("Nome: ");
					String nome = dados.readLine();
					System.out.print("Telefone:");
					String telefone = dados.readLine();
					
					Clientes cl = new Clientes();
					cl.cadastrar(registro, nome, telefone);
					cliente.add(cl);
					
					break;
					
				}
				
				case 4: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Atribuir Classificacao a um Livro");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < categoria.size(); x++)
						System.out.println(categoria.get(x).mostrar());
					System.out.print("\nInforme o codigo da Categoria: ");
					
					int codigoCategoria = Integer.parseInt(dados.readLine());	

					System.out.println("");
					
					for(int x = 0; x < livro.size(); x++)
						System.out.println(livro.get(x).mostrar());
					
					System.out.print("\nInforme o codigo do Livro: ");
					
					int codigoLivro = Integer.parseInt(dados.readLine());	
					
					categoriaLivro.add(new CategoriaLivro(categoria.get(codigoCategoria - 1), livro.get(codigoLivro - 1)));
					
					break;
				}
				
				case 5: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Atribuir Cliente a um Livro: ");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < cliente.size(); x++)
						System.out.println(cliente.get(x).mostrar());
					System.out.print("\nInforme o codigo do Cliente: ");
					
					int codigoCliente = Integer.parseInt(dados.readLine());	

					System.out.println("");
					
					for(int x = 0; x < livro.size(); x++)
						System.out.println(livro.get(x).mostrar());
					
					System.out.print("\nInforme o codigo do Livro: ");
					
					int codigoLivro = Integer.parseInt(dados.readLine());	
					
					clienteLivro.add(new ClienteLivro(cliente.get(codigoCliente - 1), livro.get(codigoLivro - 1)));
					
				}
				
				case 6: {
					
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Atribuicoes: ");
					System.out.println("-------------------------------------------------");				
					
					for(int x = 0; x < clienteLivro.size(); x++)
						System.out.println("Cliente: " + clienteLivro.get(x).getCliente().getNome() 
								         + " | Livro: " + clienteLivro.get(x).getLivro().getTitulo());
					
					for(int x = 0; x < categoriaLivro.size(); x++)
						System.out.println("Classificacao: " + categoriaLivro.get(x).getCategoria().getDescricao() 
								         + " | Livro: " + categoriaLivro.get(x).getLivro().getTitulo());
					
					
					break;
					
					
				}
				
			} 
		}while (op > 0);
		System.out.println("Obrigado por utilizar o software de gerenciamento bibliotecario de Gabriel Freschi Leme da Silva - RA:103384");
	}
}
