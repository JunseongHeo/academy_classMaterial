package getdon.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class GetBankSignController {


    // 로그인
    @GetMapping("/sign_in")
    public String sign_in() {
        return "sign/sign_in";
    }

    // 로그인 처리
    @PostMapping("/sign_in_post")
    public String sign_in_post() {
        return "redirect:/sign/sign_in_complete";
    }

    // 로그인완료
    @GetMapping("/sign_in_complete")
    public String sign_in_complete() {
        return "sign/sign_in_complete";
    }
    
    // 가입 약관동의
    @GetMapping("/sign_check")
    public String sign_check() {
        return "sign/sign_check";
    }

    // 회원가입
    @GetMapping("/sign_up")
    public String sign_up() {
        return "sign/sign_up";
    }

    // 회원가입 처리
    @PostMapping("/sign_up_post")
    public String sign_up_post() {
        return "redirect:/sign/sign_up_complete";
    }

    // 가입 완료
    @GetMapping("/sign_up_complete")
    public String sign_up_complete() {
        return "sign/sign_up_complete";
    }
}
