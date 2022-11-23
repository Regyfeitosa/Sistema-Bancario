package desafiosetembro1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BancoDadosAlunos implements BancoDados {

	List<Usuario> lista = new ArrayList<Usuario>();

	public void inserirUsuario(Usuario usuario) {
		lista.add(usuario);
	}

	public Usuario buscaUsuarioPorNome(String nome) {
		for (Usuario usuario : lista) {
			if (usuario.nome.equalsIgnoreCase(nome)) {
				return usuario;
			}
		}
		return null;
	}

	public void excluirUsuario(Usuario usuario) {
		lista.remove(usuario);
	}

	public List<Usuario> buscaTodosUsuarios() {
		return lista;
	}

	public List<Usuario> buscaUsuariosMaioresIdade() {
		List<Usuario> listaRetorno = new ArrayList<Usuario>();
		for (Usuario usuario : lista) {
			if (((Usuario) usuario).getIdade() >= 18) {
				listaRetorno.add(usuario);
			}
		}
		return listaRetorno;
	}
}