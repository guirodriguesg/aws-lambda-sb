package br.com.aws.lambda.sample.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/message")
public class GetMessageLambda {

    private static final Logger log = LoggerFactory.getLogger(GetMessageLambda.class);


    @GetMapping
    public String getMessage() {
        log.info("GETTING MESSAGE FROM LAMBDA...");
        return "Message";
    }
}
