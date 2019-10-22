package com.catdog.web.cust;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.catdog.web.utl.Printer;

@RestController								//rest방식
@RequestMapping("/customers")
//@Log4j
public class CustomerCtrl {
		private static final Logger logger = LoggerFactory.getLogger(CustomerCtrl.class);
		@Autowired Map<String, Object> map;
		@Autowired Customer cust;
		@Autowired Printer printer;
		
		@PostMapping("/")  //create
		public Map<?,?> join(@RequestBody Customer customer) { 
			//logger.info("ajax가 보낸 아이디와 비번입니다 {} ",customer.getCid()+","+customer.getPwd()+customer.getPname());
			printer.accept("람다 프린터가 보낸 값 "+customer.getCid()+","+customer.getPwd()+customer.getPname());
			Map<String, Object> map2 = new HashMap<>();
			map2.put("cid", customer.getCid());
			map2.put("pwd",customer.getPwd());
			map2.put("pname",customer.getPname());
			//logger.info("map에 담긴 아이디와 비번입니다 {} ",map2.get("cid")+","+map2.get("pwd")+","+map2.get("pname"));
			return map2;
		} 
		
		@PostMapping("/login")
		public Customer login(@RequestBody Customer param){
			logger.info("ajax가 보낸 아이디와 비번입니다 {} ",param.getCid()+","+param.getPwd()+","+param.getPname());
			cust.setCid(param.getCid());
			cust.setPwd(param.getPwd());
			cust.setPname(param.getPname());
			logger.info("cust에 보낸 사용자 정보 :  {} ", cust.toString());
			return cust;
		}
}
