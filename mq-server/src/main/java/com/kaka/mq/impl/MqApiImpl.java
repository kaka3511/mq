package com.kaka.mq.impl;

import com.kaka.mq.api.MqApi;
import com.kaka.mq.common.ServiceRequestDto;
import com.kaka.mq.common.ServiceResultDto;
import org.springframework.stereotype.Service;

/**
 * @author fuwei
 * @version V1.0
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2018/8/9 16:44
 */
@Service("mqApi")
public class MqApiImpl implements MqApi {
  @Override
  public ServiceResultDto sendMessage(ServiceRequestDto requestDto) {
    return null;
  }
}
