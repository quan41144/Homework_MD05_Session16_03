package com.quickbite.user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private static final Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/test-json-log")
    public String testJsonLog() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Đã xảy ra lỗi nghiêm trọng khi xử lý thuật toán", e);
        }
        return "Kiểm tra hệ thống log!";
    }
}
