package entidade;

// Generated 15/09/2013 23:36:41 by Hibernate Tools 3.4.0.CR1

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HorarioFuncionamentoEstabelecimento generated by hbm2java
 */
@Entity
@Table(name = "tb_horario_funcionamento_estabelecimento", catalog = "dbfastlunch")
@NamedQueries({
@NamedQuery(name="HorarioFuncionamentoEstabelecimento.buscaHorariosPorEstabelecimento",
		query="SELECT he"
			+ " FROM HorarioFuncionamentoEstabelecimento he"
			+ " WHERE he.estabelecimento.idEstabelecimento = :idEstabelecimento"
			+ " AND he.disponivel = true"
			+ " AND he.horarioFuncionamento.ativo = true"),
			
@NamedQuery(name="HorarioFuncionamentoEstabelecimento.buscaHorariosPorEstabelecimentoEDia",
			query="SELECT he"
				+ " FROM HorarioFuncionamentoEstabelecimento he"
				+ " WHERE he.estabelecimento.idEstabelecimento = :idEstabelecimento"
				+ " AND he.disponivel = true"
				+ " AND he.horarioFuncionamento.ativo = true"
				+ " AND he.horarioFuncionamento.diaSemana = :diaSemana")		
})
public class HorarioFuncionamentoEstabelecimento implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String BUSCA_HORARIOS_ESTABELECIMENTO_POR_ESTABELECIMENTO = "HorarioFuncionamentoEstabelecimento.buscaHorariosPorEstabelecimento";
	public static final String BUSCA_HORARIO_ESTABELECIMENTO_POR_ESTABELECIMENTO_E_DIA = "HorarioFuncionamentoEstabelecimento.buscaHorariosPorEstabelecimentoEDia";
	
	private Long idHorarioFuncionamentoEstabelecimento;
	private Estabelecimento estabelecimento;
	private HorarioFuncionamento horarioFuncionamento;
	private boolean disponivel;

	public HorarioFuncionamentoEstabelecimento() {
	}

	public HorarioFuncionamentoEstabelecimento(
			Estabelecimento estabelecimento,
			HorarioFuncionamento horarioFuncionamento, boolean disponivel) {
		this.estabelecimento = estabelecimento;
		this.horarioFuncionamento = horarioFuncionamento;
		this.disponivel = disponivel;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_horario_funcionamento_estabelecimento", unique = true, nullable = false)
	public Long getIdHorarioFuncionamentoEstabelecimento() {
		return this.idHorarioFuncionamentoEstabelecimento;
	}

	public void setIdHorarioFuncionamentoEstabelecimento(
			Long idHorarioFuncionamentoEstabelecimento) {
		this.idHorarioFuncionamentoEstabelecimento = idHorarioFuncionamentoEstabelecimento;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name = "id_estabelecimento", nullable = false)
	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "id_horario_funcionamento", nullable = false)
	public HorarioFuncionamento getHorarioFuncionamento() {
		return this.horarioFuncionamento;
	}

	public void setHorarioFuncionamento(
			HorarioFuncionamento horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	@Column(name = "disponivel", nullable = false)
	public boolean isDisponivel() {
		return this.disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}