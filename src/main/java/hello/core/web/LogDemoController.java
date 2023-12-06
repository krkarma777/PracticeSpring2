package hello.core.web;

import hello.core.common.MyLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    //    private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody
    public String logdemo(HttpServletRequest request) {
//        MyLogger myLogger = myLoggerProvider.getObject();
        String requestURL = request.getRequestURI().toString();
        myLogger.setRequestURL(requestURL);

        logDemoService.logic("testId");
        myLogger.log("controller test");
        return "OK";
    }

}
