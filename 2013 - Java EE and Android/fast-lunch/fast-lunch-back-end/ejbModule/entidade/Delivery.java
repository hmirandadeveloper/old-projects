package entidade;

// Generated 15/09/2013 23:36:41 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Delivery generated by hbm2java
 */
@Entity
@Table(name = "tb_delivery", catalog = "dbfastlunch")
public class Delivery implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idDelivery;
	private Pedido pedido;
	private Frete frete;
	private Endereco endereco;

	public Delivery() {
	}

	public Delivery(Pedido pedido, Frete frete, Endereco endereco) {
		this.pedido = pedido;
		this.frete = frete;
		this.endereco = endereco;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_delivery", unique = true, nullable = false)
	public Long getIdDelivery() {
		return this.idDelivery;
	}

	public void setIdDelivery(Long idDelivery) {
		this.idDelivery = idDelivery;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_frete", nullable = false)
	public Frete getFrete() {
		return this.frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_endereco", nullable = false)
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}