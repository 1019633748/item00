package cn.ttkj.item00.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Permission {
	
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(columnDefinition = "varchar(32)")
    private String id;
    
    @Column
	private String name;
}