package cn.ttkj.item00.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@GenericGenerator(name="jpa-uuid",strategy="org.hibernate.id.UUIDGenerator")
public class Role{
	
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(columnDefinition = "varchar(32)")
	private String id;
	private String name;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="role__permission",
	joinColumns= {@JoinColumn(name="roleId")},
	inverseJoinColumns= {@JoinColumn(name="permissionId")})
	private List<Permission> permissions;

	
}
