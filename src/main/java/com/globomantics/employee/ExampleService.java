package com.globomantics.employee;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {

    @ApiOperation(value="Get the default schedule for employees",
            notes="All employees share the same schedule.")
    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public String getSchedule() {

        return "Your schedule is M-F 9-5";
    }

}
