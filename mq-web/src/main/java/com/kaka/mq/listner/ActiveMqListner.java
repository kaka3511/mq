//package com.kaka.mq.listner;
//
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author fuwei
// * @version V1.0
// * @Description: TODO(用一句话描述该文件做什么)
// * @date 2018/8/10 14:46
// */
//@Component
//public class ActiveMqListner {
//
//  @JmsListener(destination = "topic")
//  public void receiveTopic(String message) {
//    System.out.println("监听topic=============监听topic");
//    System.out.println(message);
//  }
//
//  @JmsListener(destination = "cloud-queue")
//  public void receiveQueue(String message) {
//    System.out.println("监听cloud-queue=============监听cloud-queue");
//    System.out.println(message);
//  }
//}