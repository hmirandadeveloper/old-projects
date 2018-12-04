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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Frete generated by hbm2java
 */
@Entity
@Table(name = "tb_frete", catalog = "dbfastlunch")
@NamedQueries({
	@NamedQuery(name="Frete.buscarFretePorBairro",
			query="SELECT f " +
					"FROM Frete f, Estabelecimento e " +
					"WHERE f.estabelecimento.idEstabelecimento = e.idEstabelecimento" +
					" AND e.idEstabelecimento = :idEstabelecimento" +
					" AND f.bairro = :bairro" +
			" AND f.ativo = true"),
	@NamedQuery(name="Frete.buscarFretesPorEstabelecimento",
			query="SELECT f " +
					"FROM Frete f, Estabelecimento e " +
					"WHERE f.estabelecimento.idEstabelecimento = e.idEstabelecimento" +
					" AND e.idEstabelecimento = :idEstabelecimento" +
					" AND f.ativo = true")
})

public class Frete implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String BUSCA_FRETE_POR_BAIRRO = "Frete.buscarFretePorBairro";
	public static final String BUSCA_FRETES_POR_ESTABELECIMENTO = "Frete.buscarFretesPorEstabelecimento";
	private Long idFrete;
	private String bairro;
	private double valor;
	private Set<Delivery> deliveries = new HashSet<Delivery>(0);
	private Estabelecimento estabelecimento;
	private boolean ativo;

	public Frete() {
	}

	public Frete(String bairro, double valor) {
		this.bairro = bairro;
		this.valor = valor;
	}

	public Frete(String bairro, double valor, Set<Delivery> deliveries, 
			Estabelecimento estabelecimento) {
		this.bairro = bairro;
		this.valor = valor;
		this.deliveries = deliveries;
		this.estabelecimento = estabelecimento;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_frete", unique = true, nullable = false)
	public Long getIdFrete() {
		return this.idFrete;
	}

	public void setIdFrete(Long idFrete) {
		this.idFrete = idFrete;
	}

	@Column(name = "bairro", nullable = false, length = 100)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "valor", nullable = false, precision = 10, scale = 2)
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "frete")
	public Set<Delivery> getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_estabelecimento",nullable = false)
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	@Column(name = "ativo")
	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}