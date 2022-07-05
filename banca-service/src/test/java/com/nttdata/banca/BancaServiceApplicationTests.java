package com.nttdata.banca;

import com.nttdata.banca.model.Service.AsociationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancaServiceApplicationTests {
	@Autowired
	AsociationService asociationService;

	@Test
	void contextLoads() {
		//asociationService.create("62b6241f775bde424a41be70","62b5d4a72832d8369d08740d",1234);

	}

}
