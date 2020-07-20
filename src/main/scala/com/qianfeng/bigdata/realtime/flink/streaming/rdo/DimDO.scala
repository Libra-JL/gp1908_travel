package com.qianfeng.bigdata.realtime.flink.streaming.rdo

object DimDO {
	case class ProductDimDO(productID:String,productLevel:Int,productType:String,
							depCode:String,desCode:String,toursimType:String)
}
