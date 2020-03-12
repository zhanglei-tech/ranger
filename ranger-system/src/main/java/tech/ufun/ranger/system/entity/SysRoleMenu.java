package tech.ufun.ranger.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色菜单关联表(SysRoleMenu)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenu {
    /**
    * 角色id
    */    
    @TableId("role_id")
    private Long roleId;
    
    /**
    * 菜单id
    */    
    @TableId("menu_id")
    private Long menuId;
    
}