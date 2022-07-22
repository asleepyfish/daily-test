package com.asleepyfish.springboot.response.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: zhoujh42045
 * @Date: 2022/7/18 13:52
 * @Description: TODO
 */
@Data
public class BeanParam<T> {
    @NotNull(message = "数据集不能为空")
    @NotEmpty(message = "你空了")
    private List<T> data;
}
