package cs.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cs.bean.Stud;

@Configuration
public class Stdrepo {
	@Bean
	public Stud s1() {
		Stud s = new Stud();
		s.setId(111);
		s.setName("mithilesh");
		s.setMobno("9839966659");
		return s;
		
	}

}
