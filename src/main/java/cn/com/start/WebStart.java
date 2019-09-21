package cn.com.start;





import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.com.mapper")
public class WebStart {
	public static void main(String[] args) {
		//项目启动入口# 
		 SpringApplication.run(WebStart.class, args); 
	}
}
