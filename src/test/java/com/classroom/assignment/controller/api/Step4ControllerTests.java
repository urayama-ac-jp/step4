package com.classroom.assignment.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.classroom.assignment.controller.Step4Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class Step4ControllerTests {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private Step4Controller controller;

  @Test
  void contextLoads() {
    // given
    // when
    // then
    assertThat(controller).isNotNull();
  }

  @Test
  public void affiliationDepartmentItemExistenceConfirmation() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(get("/step4")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("所属学科")));
  }

}
