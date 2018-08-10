package com.kaka.mq.api;

import com.kaka.cloud.common.ServiceRequestDto;
import com.kaka.cloud.common.ServiceResultDto;

/**
 * @author fuwei
 * @version V1.0
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2018/8/9 16:35
 */
public interface MqApi {
  /**
   * MQ发消息
   * @param requestDto
   * @return
   */
  ServiceResultDto sendMessage(ServiceRequestDto requestDto);
}
