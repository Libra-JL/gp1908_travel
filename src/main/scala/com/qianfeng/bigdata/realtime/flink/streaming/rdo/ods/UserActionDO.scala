package com.qianfeng.bigdata.realtime.flink.streaming.rdo.ods

/**
 * 用户行为原始数据封装
 */
object UserActionDO {
  /**
   * 日志行为原数据封装
   */
  case class UserLogData(sid:String,userDevice:String,userDeviceType:String,
                         os:String,userId:String,userRegion:String,userRegionIP:String,longitude:String,
                         latitude:String,manufacturer:String,carrier:String,networkType:String,
                         duration:String,exts:String,action:String,eventType:String,
                         HotTarget:String,ct:Long)
}
