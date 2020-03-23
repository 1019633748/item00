package cn.ttkj.item00.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@GenericGenerator(name="jpa-uuid",strategy="org.hibernate.id.UUIDGenerator")
public class Permission {
	
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(columnDefinition = "varchar(32)")
	private String id;
	private String name;
}
