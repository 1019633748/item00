package cn.ttkj.item00.model;

import java.util.Date;
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
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@GenericGenerator(name="jpa-uuid",strategy="org.hibernate.id.UUIDGenerator")
public class User{

    @Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(columnDefinition="varchar(32)")
	private String id;
	
	@Column(columnDefinition="tinyint default 0")
	private int state;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedDate
	private Date updateDate;
	
	@Column(columnDefinition="varchar(20)")
	private String username;
	
	@Column(columnDefinition="varchar(60)")
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="user__role",
	joinColumns= {@JoinColumn(name="userId")},
	inverseJoinColumns= {@JoinColumn(name="roleId")})
	private List<Role> roles;

}