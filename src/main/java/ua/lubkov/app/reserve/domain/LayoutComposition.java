package ua.lubkov.app.reserve.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity  
@Table(name="Layout_Composition")
public class LayoutComposition implements Serializable {

	private static final long serialVersionUID = 456861349767854960L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="GEN_LAYOUT_COMPOSITION_ID")
	@SequenceGenerator(name="GEN_LAYOUT_COMPOSITION_ID", sequenceName="GEN_LAYOUT_COMPOSITION_ID")
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "layout_ref")
	private Layout layout;
	
	@ManyToOne
	@JoinColumn(name = "goods_ref")
	private Goods goods;

	@Column(name = "position_X", nullable = false)
	private Integer positionX;
	
	@Column(name = "position_Y", nullable = false)
	private Integer positionY;
	
	public LayoutComposition() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Integer getPositionX() {
		return positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
}
