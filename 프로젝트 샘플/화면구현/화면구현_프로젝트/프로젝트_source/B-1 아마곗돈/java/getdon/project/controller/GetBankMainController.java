package getdon.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GetBankMainController {
    
    // 홈 화면
    @GetMapping("/")
    public String home() {
        return "home/home";
    }

    // 계좌 입, 출금
    @GetMapping("/account_depo_and_with")
    public String account_depo_and_with() {
        return "account/account_depo_and_with";
    }
}
