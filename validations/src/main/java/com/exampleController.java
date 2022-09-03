package com;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class exampleController {

    @PostMapping("/getExample")
    public void getExample(@RequestBody @Valid exampleDATA ExamleData)
    {
        System.out.println(ExamleData.toString());
    }
}
