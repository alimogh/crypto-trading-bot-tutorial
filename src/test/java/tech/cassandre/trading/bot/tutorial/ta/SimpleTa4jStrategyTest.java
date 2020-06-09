package tech.cassandre.trading.bot.tutorial.ta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.cassandre.trading.bot.dto.market.TickerDTO;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.with;
import static org.awaitility.pollinterval.FibonacciPollInterval.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Basic Ta4j strategy test.
 */
@SpringBootTest
@DisplayName("Simple strategy test")
public class SimpleTa4jStrategyTest {

	/** How much we should wait for tests to last. */
	protected static final long MAXIMUM_RESPONSE_TIME_IN_SECONDS = 60;

	/** Simple Ta4j strategy. */
	@Autowired
	SimpleTa4jStrategy strategy;

	/**
	 * Check data reception.
	 */
	@Test
	@DisplayName("Check data reception")
	public void receivedData() {
		// Waiting to see if the strategy received the accounts update (we have two accounts).
		with().pollInterval(fibonacci(SECONDS)).await()
				.atMost(MAXIMUM_RESPONSE_TIME_IN_SECONDS, SECONDS)
				.untilAsserted(() -> assertEquals(strategy.getAccounts().size(), 2));
	}

}
