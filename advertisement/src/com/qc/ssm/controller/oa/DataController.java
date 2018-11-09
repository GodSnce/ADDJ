package com.qc.ssm.controller.oa;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public class DataController {


    @RequestMapping("/query")
    public String queryAppData(HttpServletRequest request,String rows,String pageno){



        return null;
    }

}
