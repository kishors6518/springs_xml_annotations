package school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	Student s;
	public void teach() {
		s.study();
	}

}
