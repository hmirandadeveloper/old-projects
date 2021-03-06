package entidade;

// Generated 15/09/2013 23:36:41 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name = "tb_endereco", catalog = "dbfastlunch")
public class Endereco implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idEndereco;
	private String cep;
	private String logradouro;
	private long numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String pontoReferencia;
	private Set<Delivery> deliveries = new HashSet<Delivery>(0);
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Endereco() {
	}

	public Endereco(String cep, String logradouro, long numero,
			String bairro, String cidade, String uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Endereco(String cep, String logradouro, long numero,
			String complemento, String bairro, String cidade, String uf,
			String pontoReferencia, Set<Delivery> deliveries,
			Set<Cliente> clientes) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.pontoReferencia = pontoReferencia;
		this.deliveries = deliveries;
		this.clientes = clientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_endereco", unique = true, nullable = false)
	public Long getIdEndereco() {
		return this.idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	@Column(name = "cep", nullable = false, length = 8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "logradouro", nullable = false, length = 200)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "numero", nullable = false, precision = 10, scale = 0)
	public long getNumero() {
		return this.numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Column(name = "complemento", length = 100)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "bairro", nullable = false, length = 100)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "cidade", nullable = false, length = 100)
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Column(name = "uf", nullable = false, length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Column(name = "ponto_referencia", length = 250)
	public String getPontoReferencia() {
		return this.pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "endereco")
	public Set<Delivery> getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "enderecos")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
