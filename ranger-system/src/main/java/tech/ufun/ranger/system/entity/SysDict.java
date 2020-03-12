package tech.ufun.ranger.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 字典表(SysDict)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_dict")
public class SysDict {
    /**
    * 字典id
    */    
    @TableId("dict_id")
    private Long dictId;
    
    /**
    * 字典名
    */    
    @TableField("dict_name")
    private String dictName;
    
    /**
    * 字典标识
    */    
    @TableField("dict_key")
    private String dictKey;
    
    /**
    * 是否禁用
    */    
    @TableField("is_disabled")
    private Integer isDisabled;
    
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