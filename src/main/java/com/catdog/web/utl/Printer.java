package com.catdog.web.utl;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;
import com.catdog.web.cmm.IConsumer;

@Service    //인터페이스로 했기때문
public class Printer implements IConsumer{

	@Override
	public void accept(Object o) {
		Consumer<String> c = System.out :: println;
		c.accept((String)o);
	}

}
