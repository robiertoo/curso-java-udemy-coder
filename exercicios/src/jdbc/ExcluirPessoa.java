package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		Scanner entrada = new Scanner(System.in);
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		System.out.println("Informe o codigo da pessoa a ser excluida: ");
		int codigo = entrada.nextInt();
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else System.out.println("O código não foi encontrado!");
		
		entrada.close();
		conexao.close();
		
	}
}
