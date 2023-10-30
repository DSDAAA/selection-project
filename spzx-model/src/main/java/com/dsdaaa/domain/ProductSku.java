package com.dsdaaa.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品sku
 * @TableName product_sku
 */
@TableName(value ="product_sku")
@Data
public class ProductSku implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品编号
     */
    @TableField(value = "sku_code")
    private String sku_code;

    /**
     *
     */
    @TableField(value = "sku_name")
    private String sku_name;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private Long product_id;

    /**
     * 缩略图路径
     */
    @TableField(value = "thumb_img")
    private String thumb_img;

    /**
     * 售价
     */
    @TableField(value = "sale_price")
    private BigDecimal sale_price;

    /**
     * 市场价
     */
    @TableField(value = "market_price")
    private BigDecimal market_price;

    /**
     * 成本价
     */
    @TableField(value = "cost_price")
    private BigDecimal cost_price;

    /**
     * 库存数
     */
    @TableField(value = "stock_num")
    private Integer stock_num;

    /**
     * 销量
     */
    @TableField(value = "sale_num")
    private Integer sale_num;

    /**
     * sku规格信息json
     */
    @TableField(value = "sku_spec")
    private String sku_spec;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 体积
     */
    @TableField(value = "volume")
    private BigDecimal volume;

    /**
     * 线上状态：0-初始值，1-上架，-1-自主下架
     */
    @TableField(value = "status")
    private Integer status;

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
        ProductSku other = (ProductSku) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSku_code() == null ? other.getSku_code() == null : this.getSku_code().equals(other.getSku_code()))
            && (this.getSku_name() == null ? other.getSku_name() == null : this.getSku_name().equals(other.getSku_name()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getThumb_img() == null ? other.getThumb_img() == null : this.getThumb_img().equals(other.getThumb_img()))
            && (this.getSale_price() == null ? other.getSale_price() == null : this.getSale_price().equals(other.getSale_price()))
            && (this.getMarket_price() == null ? other.getMarket_price() == null : this.getMarket_price().equals(other.getMarket_price()))
            && (this.getCost_price() == null ? other.getCost_price() == null : this.getCost_price().equals(other.getCost_price()))
            && (this.getStock_num() == null ? other.getStock_num() == null : this.getStock_num().equals(other.getStock_num()))
            && (this.getSale_num() == null ? other.getSale_num() == null : this.getSale_num().equals(other.getSale_num()))
            && (this.getSku_spec() == null ? other.getSku_spec() == null : this.getSku_spec().equals(other.getSku_spec()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSku_code() == null) ? 0 : getSku_code().hashCode());
        result = prime * result + ((getSku_name() == null) ? 0 : getSku_name().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getThumb_img() == null) ? 0 : getThumb_img().hashCode());
        result = prime * result + ((getSale_price() == null) ? 0 : getSale_price().hashCode());
        result = prime * result + ((getMarket_price() == null) ? 0 : getMarket_price().hashCode());
        result = prime * result + ((getCost_price() == null) ? 0 : getCost_price().hashCode());
        result = prime * result + ((getStock_num() == null) ? 0 : getStock_num().hashCode());
        result = prime * result + ((getSale_num() == null) ? 0 : getSale_num().hashCode());
        result = prime * result + ((getSku_spec() == null) ? 0 : getSku_spec().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", sku_code=").append(sku_code);
        sb.append(", sku_name=").append(sku_name);
        sb.append(", product_id=").append(product_id);
        sb.append(", thumb_img=").append(thumb_img);
        sb.append(", sale_price=").append(sale_price);
        sb.append(", market_price=").append(market_price);
        sb.append(", cost_price=").append(cost_price);
        sb.append(", stock_num=").append(stock_num);
        sb.append(", sale_num=").append(sale_num);
        sb.append(", sku_spec=").append(sku_spec);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
