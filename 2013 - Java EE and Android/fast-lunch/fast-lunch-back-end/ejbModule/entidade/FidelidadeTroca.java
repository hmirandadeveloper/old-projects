package entidade;

// Generated 15/09/2013 23:36:41 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FidelidadeTroca generated by hbm2java
 */
@Entity
@Table(name = "tb_fidelidade_troca", catalog = "dbfastlunch")
public class FidelidadeTroca implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idFidelidadeTroca;
	private Produto produto;
	private Cliente cliente;
	private Date dataHora;
	private int pontos;

	public FidelidadeTroca() {
	}

	public FidelidadeTroca(Produto produto, Cliente cliente) {
		this.produto = produto;
		this.cliente = cliente;
	}

	public FidelidadeTroca(Produto produto, Cliente cliente,
			Date dataHora, int pontos) {
		this.produto = produto;
		this.cliente = cliente;
		this.dataHora = dataHora;
		this.pontos = pontos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_fidelidade_troca", unique = true, nullable = false)
	public Long getIdFidelidadeTroca() {
		return this.idFidelidadeTroca;
	}

	public void setIdFidelidadeTroca(Long idFidelidadeTroca) {
		this.idFidelidadeTroca = idFidelidadeTroca;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto", nullable = false)
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_hora", length = 19)
	public Date getDataHora() {
		return this.dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	@Column(name = "pontos", nullable = false)
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}
