package com.whb.test.inter;

import com.whb.test.service.MemberFeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "order-server", fallback = MemberFeignService.class)
public interface OrderFeign {
    @RequestMapping("/orderTest")
    public String orderTest();
}