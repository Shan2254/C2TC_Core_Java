import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		Testing t=new Testing();
		int c = t.countA("Shantanu");
		assertEquals(2,c);
	}

}
