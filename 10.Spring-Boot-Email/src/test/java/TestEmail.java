import com.spbt.EmailApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

/**
 * 测试.
 *
 * @author zcb 2021/3/8
 */
@SpringBootTest(classes = EmailApplication.class)
public class TestEmail {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Test
    public void send() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sendSimpleEmail"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
