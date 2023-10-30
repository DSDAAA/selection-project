package com.dsdaaa.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品
 * @TableName product
 */
@TableName(value ="product")
@Data
public class Product implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 品牌ID
     */
    @TableField(value = "brand_id")
    private Long brand_id;

    /**
     * 一级分类id
     */
    @TableField(value = "category1_id")
    private Long category1_id;

    /**
     * 二级分类id
     */
    @TableField(value = "category2_id")
    private Long category2_id;

    /**
     * 三级分类id
     */
    @TableField(value = "category3_id")
    private Long category3_id;

    /**
     * 计量单位
     */
    @TableField(value = "unit_name")
    private String unit_name;

    /**
     * 轮播图
     */
    @TableField(value = "slider_urls")
    private String slider_urls;

    /**
     * 商品规格json
     */
    @TableField(value = "spec_value")
    private String spec_value;

    /**
     * 线上状态：0-初始值，1-上架，-1-自主下架
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 审核状态：0-初始值，1-通过，-1-未通过
     */
    @TableField(value = "audit_status")
    private Integer audit_status;

    /**
     * 审核信息
     */
    @TableField(value = "audit_message")
    private String audit_message;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 删除标记（0:不可用 1:可用）
     */
    @TableField(value = "is_deleted")
    private Integer is_deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBrand_id() == null ? other.getBrand_id() == null : this.getBrand_id().equals(other.getBrand_id()))
            && (this.getCategory1_id() == null ? other.getCategory1_id() == null : this.getCategory1_id().equals(other.getCategory1_id()))
            && (this.getCategory2_id() == null ? other.getCategory2_id() == null : this.getCategory2_id().equals(other.getCategory2_id()))
            && (this.getCategory3_id() == null ? other.getCategory3_id() == null : this.getCategory3_id().equals(other.getCategory3_id()))
            && (this.getUnit_name() == null ? other.getUnit_name() == null : this.getUnit_name().equals(other.getUnit_name()))
            && (this.getSlider_urls() == null ? other.getSlider_urls() == null : this.getSlider_urls().equals(other.getSlider_urls()))
            && (this.getSpec_value() == null ? other.getSpec_value() == null : this.getSpec_value().equals(other.getSpec_value()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAudit_status() == null ? other.getAudit_status() == null : this.getAudit_status().equals(other.getAudit_status()))
            && (this.getAudit_message() == null ? other.getAudit_message() == null : this.getAudit_message().equals(other.getAudit_message()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBrand_id() == null) ? 0 : getBrand_id().hashCode());
        result = prime * result + ((getCategory1_id() == null) ? 0 : getCategory1_id().hashCode());
        result = prime * result + ((getCategory2_id() == null) ? 0 : getCategory2_id().hashCode());
        result = prime * result + ((getCategory3_id() == null) ? 0 : getCategory3_id().hashCode());
        result = prime * result + ((getUnit_name() == null) ? 0 : getUnit_name().hashCode());
        result = prime * result + ((getSlider_urls() == null) ? 0 : getSlider_urls().hashCode());
        result = prime * result + ((getSpec_value() == null) ? 0 : getSpec_value().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAudit_status() == null) ? 0 : getAudit_status().hashCode());
        result = prime * result + ((getAudit_message() == null) ? 0 : getAudit_message().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", brand_id=").append(brand_id);
        sb.append(", category1_id=").append(category1_id);
        sb.append(", category2_id=").append(category2_id);
        sb.append(", category3_id=").append(category3_id);
        sb.append(", unit_name=").append(unit_name);
        sb.append(", slider_urls=").append(slider_urls);
        sb.append(", spec_value=").append(spec_value);
        sb.append(", status=").append(status);
        sb.append(", audit_status=").append(audit_status);
        sb.append(", audit_message=").append(audit_message);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
