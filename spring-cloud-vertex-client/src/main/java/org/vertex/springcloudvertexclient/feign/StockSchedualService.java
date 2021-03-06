package org.vertex.springcloudvertexclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.vertex.common.result.ResultBean;

/**
 * @author zhengdu
 * @date 2019/5/9 下午3:07
 */
@FeignClient(name = "Eureka-Client-B")
public interface StockSchedualService {

    @RequestMapping(value = "/api/v1/stock/save",method = RequestMethod.GET)
    ResultBean save(@RequestParam(value = "goods") String goods);
}
