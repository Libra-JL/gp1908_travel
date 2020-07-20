package com.qianfeng.bigdata.realtime.flink.streaming.rdo.dw

object UserActionDetailDO {
  //用户启动日志数据
  case class UserLogLaunchData(userDevice:String,userId:String,userRegion:String,
                               userRegionIp:String,os:String, osversion:String,networkType:String,ct:Long)

  //页面浏览日志操作数据
  case class UserLogPageViewData(sid:String,userDevice:String,userDeviceType:String,
                                 os:String,userId:String,userRegion:String,userRegionIP:String,longitude:String,
                                 latitude:String,manufacturer:String,carrier:String,networkType:String,
                                 duration:String,action:String,eventType:String,
                                 ct:Long,targetId:String)

  //用户点击数据封装
  case class UserLogClickData(sid:String,userDevice:String,userDeviceType:String,
                              os:String,userId:String,userRegion:String,longitude:String,
                              latitude:String,manufacturer:String,carrier:String,networkType:String,
                              duration:String,action:String,eventType:String,
                              ct:Long,targetId:String,eventTargetType:String)

  //用户行为产品浏览数据封装
  case class UserLogViewListFactData(sid:String,userDevice:String,userDeviceType:String,
                                     os:String,userId:String,userRegion:String,longitude:String,
                                     latitude:String,manufacturer:String,carrier:String,networkType:String,
                                     duration:String,action:String,eventType:String,
                                     ct:Long,targetId:String,hotTarget:String,travelSend:String,
                                     travelSendTime:String,travelTime:String,productLevel:String,
                                     productType:String)
}
