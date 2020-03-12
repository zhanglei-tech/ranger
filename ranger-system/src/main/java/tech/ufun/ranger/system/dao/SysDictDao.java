package tech.ufun.ranger.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.ranger.system.entity.SysDict;

/**
 * 字典表(SysDict)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-03-12 09:38:12
 */
@Repository
public interface SysDictDao extends BaseMapper<SysDict> {
}