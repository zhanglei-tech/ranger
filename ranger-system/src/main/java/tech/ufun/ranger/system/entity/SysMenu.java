package tech.ufun.ranger.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 菜单表(SysMenu)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_menu")
public class SysMenu {
    /**
    * 菜单id
    */    
    @TableId("menu_id")
    private Long menuId;
    
    /**
    * 菜单名称
    */    
    @TableField("menu_name")
    private String menuName;
    
    /**
    * 父菜单id
    */    
    @TableField("parent_id")
    private Long parentId;
    
    /**
    * 显示顺序
    */    
    @TableField("list_order")
    private Integer listOrder;
    
    /**
    * 请求地址
    */    
    @TableField("url")
    private String url;
    
    /**
    * 菜单类型
    */    
    @TableField("menu_type")
    private Integer menuType;
    
    /**
    * 是否显示
    */    
    @TableField("is_visible")
    private Integer isVisible;
    
    /**
    * 权限标识
    */    
    @TableField("permission")
    private String permission;
    
    /**
    * 菜单图标
    */    
    @TableField("menu_icon")
    private String menuIcon;
    
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