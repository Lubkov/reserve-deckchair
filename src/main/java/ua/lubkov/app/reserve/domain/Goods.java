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
@Table(name="Goods")
public class Goods implements Serializable {

	private static final long serialVersionUID = 6706908123152126490L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="GEN_GOODS_ID")
	@SequenceGenerator(name="GEN_GOODS_ID", sequenceName="GEN_GOODS_ID")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 64)
	private String name = "";
	
	@Column(name = "number", nullable = false)
	private Integer number = 0;		
	
	@ManyToOne
	@JoinColumn(name = "goods_type_ref")
	private GoodsType goodsType;
	
	public Goods() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
}
