package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void home_page_has_expected_content() throws Exception {
        MvcResult response = mvc.perform(MockMvcRequestBuilders.get("/").accept("text/html;charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        String actualContent = response.getResponse().getContentAsString();
        String expectedContent = HelloController.homePageContent;
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void hello_es_page_has_expected_content() throws Exception {
        MvcResult response = mvc.perform(MockMvcRequestBuilders.get("/es").accept("text/html;charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        String actualContent = response.getResponse().getContentAsString();
        String expectedContent = HelloController.hello_es_content;
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void hello_fr_page_has_expected_content() throws Exception {
        MvcResult response = mvc.perform(MockMvcRequestBuilders.get("/fr").accept("text/html;charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        String actualContent = response.getResponse().getContentAsString();
        String expectedContent = HelloController.hello_fr_content;
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void hello_cn_page_has_expected_content() throws Exception {
        MvcResult response = mvc.perform(MockMvcRequestBuilders.get("/cn").accept("text/html;charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        String actualContent = response.getResponse().getContentAsString();
        String expectedContent = HelloController.hello_cn_content;
        assertEquals(expectedContent, actualContent);
    }

}
