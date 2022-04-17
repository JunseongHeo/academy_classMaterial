package getdon.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get_mall")
public class GetBankMallController {

    // mall home
    @GetMapping("/get_mall_home")
    public String get_mall_home() {
        return "get_mall/get_mall_home";
    }

    // 물품 등록
    @GetMapping("/get_mall_regist")
    public String get_mall_regist() {
        return "get_mall/get_mall_regist";
    }

    // 물품 구매
    @GetMapping("/get_mall_buy")
    public String get_mall_buy() {
        return "get_mall/get_mall_buy";
    }

    // 미니게임
    @GetMapping("/get_mall_minigame")
    public String get_mall_minigame() {
        return "get_mall/get_mall_minigame";
    }
}
