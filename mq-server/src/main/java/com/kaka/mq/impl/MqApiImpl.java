package com.kaka.mq.impl;

import com.kaka.cloud.common.ServiceRequestDto;
import com.kaka.cloud.common.ServiceResultDto;
import com.kaka.mq.api.MqApi;
import java.util.Map;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

/**
 * @author fuwei
 * @version V1.0
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2018/8/9 16:44
 */
@Service("mqApi")
public class MqApiImpl implements MqApi {

  public static final String CLOUD_QUEUE = "cloud-queue";

  @Autowired
  private JmsTemplate jmsTemplate;

  @Override
  public ServiceResultDto sendMessage(ServiceRequestDto requestDto) {
    Map map = requestDto.getValues();
    String msg = "";
    if (null != map.get("msg") && !"".equals(map.get("msg").toString().trim())) {
      msg = map.get("msg").toString().trim();
    }

    send(msg);

    ServiceResultDto resultDto = ServiceResultDto.success();
    return resultDto;
  }

  public void send(final String msg) {
    //发送queue消息
    jmsTemplate.send(CLOUD_QUEUE, new MessageCreator() {
      @Override
      public Message createMessage(Session session) throws JMSException {
        TextMessage textMessage = session.createTextMessage();
        textMessage.setText(msg);
        return textMessage;
      }
    });
  }
}
