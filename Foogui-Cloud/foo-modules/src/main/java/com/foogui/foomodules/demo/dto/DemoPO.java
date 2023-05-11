package com.foogui.foomodules.demo.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.foogui.foo.common.dao.mybatis.domain.BasePO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

@TableName("t_demo")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemoPO extends BasePO implements Serializable {

    private static final long serialVersionUID = -3188123308432513983L;


    private String demoData;

    private String context;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public DemoVO convert2VO() {
        DemoVO vo = new DemoVO();
        BeanUtils.copyProperties(this, vo);
        return vo;
    }
}
