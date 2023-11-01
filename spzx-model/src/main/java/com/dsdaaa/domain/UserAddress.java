package com.dsdaaa.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户地址表
 * @TableName user_address
 */
@TableName(value ="user_address")
@Data
public class UserAddress implements Serializable {
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer user_id;

    /**
     *
     */
    @TableField(value = "name")
    private String name;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 标签名称
     */
    @TableField(value = "tag_name")
    private String tag_name;

    /**
     *
     */
    @TableField(value = "province_code")
    private String province_code;

    /**
     *
     */
    @TableField(value = "city_code")
    private String city_code;

    /**
     *
     */
    @TableField(value = "district_code")
    private String district_code;

    /**
     * 详细地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 完整地址
     */
    @TableField(value = "full_address")
    private String full_address;

    /**
     * 是否默认地址（0：否 1：是）
     */
    @TableField(value = "is_default")
    private Integer is_default;

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
     * 删除标识（0：否 1：是）
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
        UserAddress other = (UserAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getTag_name() == null ? other.getTag_name() == null : this.getTag_name().equals(other.getTag_name()))
            && (this.getProvince_code() == null ? other.getProvince_code() == null : this.getProvince_code().equals(other.getProvince_code()))
            && (this.getCity_code() == null ? other.getCity_code() == null : this.getCity_code().equals(other.getCity_code()))
            && (this.getDistrict_code() == null ? other.getDistrict_code() == null : this.getDistrict_code().equals(other.getDistrict_code()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFull_address() == null ? other.getFull_address() == null : this.getFull_address().equals(other.getFull_address()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getTag_name() == null) ? 0 : getTag_name().hashCode());
        result = prime * result + ((getProvince_code() == null) ? 0 : getProvince_code().hashCode());
        result = prime * result + ((getCity_code() == null) ? 0 : getCity_code().hashCode());
        result = prime * result + ((getDistrict_code() == null) ? 0 : getDistrict_code().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFull_address() == null) ? 0 : getFull_address().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
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
        sb.append(", user_id=").append(user_id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", tag_name=").append(tag_name);
        sb.append(", province_code=").append(province_code);
        sb.append(", city_code=").append(city_code);
        sb.append(", district_code=").append(district_code);
        sb.append(", address=").append(address);
        sb.append(", full_address=").append(full_address);
        sb.append(", is_default=").append(is_default);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
