package br.com.javaparaweb.financeiro.usuario;
import java.util.List;
import br.com.javaparaweb.financeiro.util.DAOFactory;


public class UsuarioRN {
   private UsuarioDAO usuarioDAO;
   
   public UsuarioRN() {
	   this.usuarioDAO = DAOFactory.criarUsuarioDAO();
   }
   
   public Usuario carregar(Integer codigo) {
	   return this.usuarioDAO.carregar(codigo);
   }
   
   public Usuario buscaPorLogin(String login) {
	   return this.buscaPorLogin(login);
   }
   
   public void salvar(Usuario usuario) {
	   Integer codigo = usuario.getCodigo();
	   
	   if (codigo == null || codigo ==0) {
		   //add default permission : ROLE_USUARIO
		   usuario.getPermissao().add("ROLE_USUARIO");
		   this.usuarioDAO.salvar(usuario);
	   }else {
		   this.usuarioDAO.atualizar(usuario);
	   }
   }
   
   public void excluir(Usuario usuario) {
	   this.usuarioDAO.excluir(usuario);
   }
   
   public List<Usuario> listar(){
	   return this.usuarioDAO.listar();
   }
}
