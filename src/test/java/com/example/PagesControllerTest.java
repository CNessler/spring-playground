package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Claire on 3/22/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(PagesController.class)
public class PagesControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testPi() throws Exception {

        this.mvc.perform(get("/math/pi")).andExpect(status().isOk()).andExpect(content().string("3.14159"));
    }
}
