package com.whb.test.service;

import com.whb.test.inter.OrderFeign;
import org.springframework.stereotype.Component;

@Component
public class MemberFeignService implements OrderFeign {

	@Override
	public String orderTest() {
		return "出错啦";
	}
}