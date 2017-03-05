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
@Table(name="Background")
public class Background implements Serializable {

	private static final long serialVersionUID = -8810256522491635574L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="GEN_GOODS_TYPE_ID")
	@SequenceGenerator(name="GEN_GOODS_TYPE_ID", sequenceName="GEN_GOODS_TYPE_ID")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 256)
	private String name = "";
	
	@Column(name = "width", nullable = true)
	private Integer width;	
	
	@Column(name = "height", nullable = true)
	private Integer height;
	
	public Background() {
		
	}
	
	public Background(String name, 
			          Integer width, 
			          Integer height) {
		this.name = name;
		this.width = width;
		this.height = height;
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

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}	

}
