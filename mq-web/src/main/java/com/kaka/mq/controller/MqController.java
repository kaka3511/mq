package com.kaka.mq.controller;

import com.kaka.cloud.common.ServiceRequestDto;
import com.kaka.cloud.common.ServiceResultDto;
import com.kaka.mq.api.MqApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fuwei
 * @version V1.0
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2018/8/9 16:51
 */
@Controller
@EnableAutoConfiguration
@CrossOrigin(value = "*" ,maxAge = 360)
public class MqController {

  @Autowired
  private MqApi mqApi;

  @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
  @ResponseBody
  public ServiceResultDto healthCheck() {
    ServiceRequestDto serviceRequestDto = new ServiceRequestDto();
    serviceRequestDto.set("msg", "test");
    return mqApi.sendMessage(serviceRequestDto);
  }
}
