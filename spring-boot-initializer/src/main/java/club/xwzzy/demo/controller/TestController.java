package club.xwzzy.demo.controller;

import club.xwzzy.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping(value = "/test")
    @ResponseBody
    public String  test()
    {
         return testService.get();
    }
}
