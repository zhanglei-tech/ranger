package tech.ufun.ranger.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户角色关联表(SysUserRole)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_user_role")
public class SysUserRole {
    /**
    * 用户id
    */    
    @TableId("user_id")
    private Long userId;
    
    /**
    * 角色id
    */    
    @TableId("role_id")
    private Long roleId;
    
}