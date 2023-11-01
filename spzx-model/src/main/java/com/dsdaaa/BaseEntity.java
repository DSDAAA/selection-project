package com.dsdaaa;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // 主键ID
    private Long id;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;

    // 其他属性...

    // 无参构造方法
    public BaseEntity() {
    }

    // 有参构造方法
    public BaseEntity(Long id, Date createTime, Date updateTime) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // getter 和 setter 方法...
}
