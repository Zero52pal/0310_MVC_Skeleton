package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// 이 클래스가 컨트롤러임을 명시
public class Tiger {
	
	@RequestMapping("/t1")	//함수 매핑
	String func01() {
		System.out.println("호랑이1");
		
		return "TigerView";	//여기서 리턴되는 String은 무조건 JSP이름으로 보고 Tiger.jsp를 찾는다.
	}
	
}