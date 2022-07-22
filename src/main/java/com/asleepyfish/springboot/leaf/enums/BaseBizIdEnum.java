package com.asleepyfish.springboot.leaf.enums;

import com.sankuai.inf.leaf.plugin.bizid.enums.BizIdManager;

/**
 * @Author: zhoujh42045
 * @Date: 2022/7/21 11:06
 * @Description: 基础业务ID枚举类
 */
public enum BaseBizIdEnum implements BizIdManager {
    /**
     * 机构编号
     */
    INSTITUTION("INSTITUTION", "yyyyMMddHHmm", 10, "机构编号"),
    SECURITY("SECURITY", "yyyyMMdd", 8, "证券编号");

    private final String prefix;

    private final String dateFormat;

    private final Integer sequenceLength;

    private final String desc;

    BaseBizIdEnum(String prefix, String dateFormat, Integer sequenceLength, String desc) {
        this.prefix = prefix;
        this.dateFormat = dateFormat;
        this.sequenceLength = sequenceLength;
        this.desc = desc;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public String getDateFormat() {
        return dateFormat;
    }

    @Override
    public Integer getSequenceLength() {
        return sequenceLength;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
