package com.lr.common.ms.service.vo;


import com.lr.common.ms.service.entity.Goods;
import lombok.Data;

import java.util.Date;
@Data
public class GoodsVo extends Goods {
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}
