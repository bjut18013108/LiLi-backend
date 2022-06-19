package controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class jsonBeanHello {

    private static Logger log = LoggerFactory.getLogger(jsonBeanHello.class);

    // 示例1：基础网页路由
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello Spring!";
    }

    // 示例2：解析GET方法中的路径参数 要求url中参数数量与PathVariable中的数量相同
    @RequestMapping(value = "getPathArgs/{arg1}/{arg2}", method = RequestMethod.GET)
    public String getPathArgs(@PathVariable("arg1") String arg1, @PathVariable("arg1") String arg2) {
        log.info("arg1 is " + arg1 + "; arg2 is" + arg2);
        return "arg1 is " + arg1 + "; arg2 is " + arg2;
    }

    // 示例3：解析GET方法中的请求参数 要求url中参数的key等于RequestParam参数中的变量名一一对应
    @RequestMapping(value = "getArgs", method = RequestMethod.GET)
    public String getArgs(@RequestParam String arg1, @RequestParam String arg2) {
        log.info("arg1 is " + arg1 + "; arg2 is" + arg2);
        return "arg1 is " + arg1 + "; arg2 is " + arg2;
    }

    // 示例4：解析GET方法中的请求参数，并设置默认值或是否为必要参数
    @RequestMapping(value = "getDefaultArgs", method = RequestMethod.GET)
    public String getDefaultArgs(@RequestParam(required=false, defaultValue="default value") String arg1) {
        log.info("arg1 is " + arg1);
        return "arg1 is " + arg1;
    }

}
