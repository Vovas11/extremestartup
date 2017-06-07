package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainControllerTest {
    private final MainController server = new MainController();

    @Test
    public void should_accept_missing_input() {
        assertEquals(server.test(null), "team name");
    }

    @Test
    public void should_add_numbers() {
        assertEquals(server.test("what is the sum of 14 and 4"), "18");
}

}
