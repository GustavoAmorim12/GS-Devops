package br.com.safework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.test.mock.mockito.MockBean;
import br.com.safework.ai.OllamaImageAnalyzer;

@SpringBootTest
@ActiveProfiles("test")
class SafeworkAiServiceApplicationTests {

    @MockBean
    private OllamaImageAnalyzer ollamaImageAnalyzer;

    @Test
    void contextLoads() {
    }

}