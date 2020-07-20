package com.qianfeng.bigdata.realtime.flink.streaming.rdo.app

object UserActionAppDO {
  /**
   *用户行为日志点击行为统计输出数据
   */
  case class UserLogClickDimMeanData2(eventTargetType:String, access:Long, users:Long, startWindowTime:Long, endWindowTime:Long)

}
