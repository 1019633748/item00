package cn.ttkj.item00.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cn.ttkj.item00.model.User;



@RepositoryRestResource(path="users")
public interface UserRepo extends PagingAndSortingRepository<User, String>{

}
