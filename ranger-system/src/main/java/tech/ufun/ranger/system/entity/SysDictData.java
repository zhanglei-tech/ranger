package tech.ufun.ranger.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 字典数据表(SysDictData)实体类
 *
 * @author zhanglei
 * @since 2020-03-12 10:53:00
 */
@Data
@TableName("sys_dict_data")
public class SysDictData {
    /**
    * 字典数据id
    */    
    @TableId("dict_data_id")
    private Long dictDataId;
    
    /**
    * 字典标签
    */    
    @TableField("dict_label")
    private String dictLabel;
    
    /**
    * 字典标识
    */    
    @TableField("dict_key")
    private String dictKey;
    
    /**
    * 字典值
    */    
    @TableField("dict_value")
    private String dictValue;
    
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