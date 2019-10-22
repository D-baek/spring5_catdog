package com.catdog.web.cust;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자
public class Customer{
	private String cid,pwd,ssn,creditCard,pname,phone,address,email;
	
}
