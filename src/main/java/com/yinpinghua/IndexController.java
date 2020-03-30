package com.yinpinghua;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    //返回字符串
    @ResponseBody
    @RequestMapping(value = "/HelloWord")
    public String HelloWord() {
        return "HelloW";
    }
    //返回jsp视图
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("name","jsp页面展示");
        return "index";
    }
}
