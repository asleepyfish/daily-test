package com.asleepyfish.springboot.leaf.controller;

import com.asleepyfish.springboot.leaf.enums.BaseBizIdEnum;
import com.sankuai.inf.leaf.plugin.utils.BizIdUtils;
import com.sankuai.inf.leaf.plugin.utils.SegmentIdUtils;
import com.sankuai.inf.leaf.plugin.utils.SnowflakeIdUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujh42045
 */
@RestController
public class LeafController {
    @PostMapping("/getSegmentId")
    public Long getSegmentId(String key) {
        return SegmentIdUtils.getId(key);
    }

    @PostMapping("/getSnowflakeId")
    public Long getSnowflakeId() {
        return SnowflakeIdUtils.getId();
    }

    @PostMapping("/getBizId")
    public String getBizId() {
        return BizIdUtils.getId(BaseBizIdEnum.INSTITUTION);
    }
}
