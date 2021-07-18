package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		Curso procurado = null;
		
		for(Curso curso: this.cursos ) {
			if(curso.nome.equals(nome)) procurado = curso;
		}
		
		return procurado;
	}
	
	public String toString() {
		return nome;
	}
}
