package com.qianfeng.bigdata.realtime.flink.streaming.rdo.dim

/**
 * 用户行为数据维度封装
 */
object UserActionDim {
  //行为维度封装
  case class ActionDim(code:String,desc:String,remark:String)
}
