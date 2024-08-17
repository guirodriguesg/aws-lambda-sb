package br.com.aws.lambda.sample.infrastructure.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class HandlerMessage implements RequestHandler<Map<String,String>, Void> {

    private static final Logger log = LoggerFactory.getLogger(HandlerMessage.class);

    @Override
    public Void handleRequest(Map<String, String> stringStringMap, Context context) {
        log.info("Calling handlerMessage...");

        log.info("This is message received: " + stringStringMap.get("message"));

        log.info("End message...");
        return null;
    }
}
