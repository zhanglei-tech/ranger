package tech.ufun.ranger.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表(SysUser)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_user")
public class SysUser {
    /**
    * 用户id
    */    
    @TableId("user_id")
    private Long userId;
    
    /**
    * 用户名
    */    
    @TableField("login_name")
    private String loginName;
    
    /**
    * 用户昵称
    */    
    @TableField("nickname")
    private String nickname;
    
    /**
    * 电子邮箱
    */    
    @TableField("email")
    private String email;
    
    /**
    * 手机号码
    */    
    @TableField("mobile")
    private String mobile;
    
    /**
    * 用户头像
    */    
    @TableField("avatar")
    private String avatar;
    
    /**
    * 用户密码
    */    
    @TableField("password")
    private String password;
    
    /**
    * 盐加密
    */    
    @TableField("salt")
    private String salt;
    
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