package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioUpdatePessoa {
	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);		
		
		System.out.print("Digite o código da pessoa a ser atualizada: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {		
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("Os dados atuais são:");
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
			
			System.out.print("Digite o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt = conexao.prepareStatement(update);
			stmt.setInt(2, codigo);
			stmt.setString(1, novoNome);
			stmt.execute();
			
			
			pessoa = new Pessoa(codigo, novoNome);			
			System.out.println("Novo nome: ");
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
			
		} else System.out.println("Código informado não encontrado!");
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
