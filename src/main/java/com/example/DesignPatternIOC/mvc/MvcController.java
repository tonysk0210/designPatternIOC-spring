package com.example.DesignPatternIOC.mvc;

import com.example.DesignPatternIOC.mvc.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
    @GetMapping("/mvc")
    public String showMvcPage(Model model) {
        // 建立一個 model 資料物件
        Message message = new Message("Welcome to Spring MVC!");

        // 加入 model 以供 view 顯示
        model.addAttribute("msg", message);

        // 回傳 view 名稱（會對應到 /WEB-INF/views/mvcview.jsp）
        return "mvcview";
    }
}
