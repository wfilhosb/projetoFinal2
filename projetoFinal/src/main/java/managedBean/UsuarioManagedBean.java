package managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import dao.UsuarioDao;
import model.Usuario;

@ViewScoped
@ManagedBean(name="usuarioManagedBean")
public class UsuarioManagedBean {
	
	//declaração dos objetos e variaveis utilizadas
	private Usuario usuario = new Usuario(); //dados do usuario que estaremos manipulando
	private List<Usuario> listaUsuario = new ArrayList<Usuario>(); //lista de todos os usuarios
	private UsuarioDao usuarioDao = new UsuarioDao<Usuario>(); //objeto usuario que possuia as funcoes criar, alterar, listar e excluir
	private String campoPesquisa; //variavel que armazena temporariamente o termo que estamos buscando
	
	//esse método carregará uma única vez toda lista de usuarios e deixar disponível para usarmos
	@PostConstruct
	public void init() {
		listaUsuario = usuarioDao.listar(Usuario.class);
	}
	
	//getters e setters dos objetos e variáveis
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	public String getCampoPesquisa() {
		return campoPesquisa;
	}
	public void setCampoPesquisa(String campoPesquisa) {
		this.campoPesquisa = campoPesquisa;
	}
	
	public void salvar() {
		usuarioDao.salvar(usuario);//salva no banco de dados e nada mais
		listaUsuario.add(usuario);//salva na lista temporária que carrega no início do sistema
		usuario = new Usuario();// faço a limpeza do objeto deixando ele em branco para qualquer nova ação na tela
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Informação: ", "Usuário salvo com sucesso!"));
	}
	
	public void pesquisar() {
		
	}
}
