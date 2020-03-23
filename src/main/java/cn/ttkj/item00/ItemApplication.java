package cn.ttkj.item00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import cn.ttkj.item00.filter.PermFilter;

@SpringBootApplication
@ServletComponentScan(basePackageClasses=PermFilter.class)
public class ItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

}
