package tech.ufun.ranger.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色表(SysRole)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_role")
public class SysRole {
    /**
    * 角色id
    */    
    @TableId("role_id")
    private Long roleId;
    
    /**
    * 角色名称
    */    
    @TableField("role_name")
    private String roleName;
    
    /**
    * 角色标识
    */    
    @TableField("role_key")
    private String roleKey;
    
    /**
    * 显示顺序
    */    
    @TableField("list_order")
    private Integer listOrder;
    
    /**
    * 是否禁用
    */    
    @TableField("is_disabled")
    private Integer isDisabled;
    
    /**
    * 是否删除
    */    
    @TableField("is_deleted")
    private Integer isDeleted;
    
    /**
    * 创建人
    */    
    @TableField("create_by")
    private String createBy;
    
    /**
    * 创建时间
    */    
    @TableField("create_time")
    private Date createTime;
    
    /**
    * 更新人
    */    
    @TableField("update_by")
    private String updateBy;
    
    /**
    * 更新时间
    */    
    @TableField("update_time")
    private Date updateTime;
    
}