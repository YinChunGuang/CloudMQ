package org.mengyun.cloudmq.sample.quickstart;

import org.mengyun.cloudmq.client.MQProducer;
import org.mengyun.cloudmq.common.message.Message;

/**
 * Created by changming.xie on 5/9/17.
 */
public class Producer {

    public static void main(String[] args) {

        MQProducer producer = null;

        producer.start();

        Message message = new Message("test", "hello".getBytes());
        producer.send(message);
    }
}
