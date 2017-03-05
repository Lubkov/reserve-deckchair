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
@Table(name="Layout")
public class Layout implements Serializable {
	
	private static final long serialVersionUID = 4765874680800519591L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="GEN_LAYOUT_ID")
	@SequenceGenerator(name="GEN_LAYOUT_ID", sequenceName="GEN_LAYOUT_ID")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 64)
	private String name = "";
		
	@Column(name = "actived", nullable = false)
	private Boolean actived = true;
	
	@Column(name = "background", nullable = true, length = 256)
	private String background = "";
	
	@Column(name = "width", nullable = true)
	private Integer width;
	
	@Column(name = "height", nullable = true)
	private Integer height;
	
	public Layout() {
		
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

	public Boolean getActived() {
		return actived;
	}

	public void setActived(Boolean actived) {
		this.actived = actived;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
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

