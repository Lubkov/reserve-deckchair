package ua.lubkov.app.reserve.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity  
@Table(name="GoodsType")
public class GoodsType implements Serializable {

	private static final long serialVersionUID = -1381426499195380669L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="GEN_GOODS_TYPE_ID")
	@SequenceGenerator(name="GEN_GOODS_TYPE_ID", sequenceName="GEN_GOODS_TYPE_ID")
    @Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 64)
	private String name = "";
	
	public GoodsType() {
		
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
	
}
