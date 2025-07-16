package com.example.users.controller;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.users.model.User;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
class UserControllerTests {

  @Autowired private MockMvc mockMvc;

  @MockitoBean private UserController userController;

  @Test
  void greetingShouldReturnUsersFromService() throws Exception {
    User user1 = new User();
    user1.setId(1L);
    user1.setUsername("user1");

    User user2 = new User();
    user2.setId(2L);
    user2.setUsername("user2");

    when(userController.all()).thenReturn(List.of(user1, user2));
    this.mockMvc
        .perform(get("/users"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("user1")))
        .andExpect(content().string(containsString("user2")));
  }
}
