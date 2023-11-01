package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单项信息
 * @TableName order_item
 */
@TableName(value ="order_item")
@Data
public class OrderItem implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    @TableField(value = "order_id")
    private Long order_id;

    /**
     * 商品sku编号
     */
    @TableField(value = "sku_id")
    private Long sku_id;

    /**
     * 商品sku名字
     */
    @TableField(value = "sku_name")
    private String sku_name;

    /**
     * 商品sku图片
     */
    @TableField(value = "thumb_img")
    private String thumb_img;

    /**
     * 商品sku价格
     */
    @TableField(value = "sku_price")
    private BigDecimal sku_price;

    /**
     * 商品购买的数量
     */
    @TableField(value = "sku_num")
    private Integer sku_num;

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
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getSku_id() == null ? other.getSku_id() == null : this.getSku_id().equals(other.getSku_id()))
            && (this.getSku_name() == null ? other.getSku_name() == null : this.getSku_name().equals(other.getSku_name()))
            && (this.getThumb_img() == null ? other.getThumb_img() == null : this.getThumb_img().equals(other.getThumb_img()))
            && (this.getSku_price() == null ? other.getSku_price() == null : this.getSku_price().equals(other.getSku_price()))
            && (this.getSku_num() == null ? other.getSku_num() == null : this.getSku_num().equals(other.getSku_num()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getSku_id() == null) ? 0 : getSku_id().hashCode());
        result = prime * result + ((getSku_name() == null) ? 0 : getSku_name().hashCode());
        result = prime * result + ((getThumb_img() == null) ? 0 : getThumb_img().hashCode());
        result = prime * result + ((getSku_price() == null) ? 0 : getSku_price().hashCode());
        result = prime * result + ((getSku_num() == null) ? 0 : getSku_num().hashCode());
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
        sb.append(", order_id=").append(order_id);
        sb.append(", sku_id=").append(sku_id);
        sb.append(", sku_name=").append(sku_name);
        sb.append(", thumb_img=").append(thumb_img);
        sb.append(", sku_price=").append(sku_price);
        sb.append(", sku_num=").append(sku_num);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}