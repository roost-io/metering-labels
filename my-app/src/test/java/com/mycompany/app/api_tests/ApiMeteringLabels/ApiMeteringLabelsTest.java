
package com.mycompany.app.api_tests;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
// import com.intuit.karate.http.HttpServer;
// import com.intuit.karate.http.ServerConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiMeteringLabelsTest {

	@Test
	void testAll() {
		String apihost = System.getenv().get("API_HOST");
		Results results = Runner.path("src/test/java/com/mycompany/app/api_tests/ApiMeteringLabels")
			.systemProperty("API_HOST", apihost)
			.reportDir("testReport")
			.parallel(1);
		assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}

}
