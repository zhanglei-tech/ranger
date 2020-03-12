package tech.ufun.ranger.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.ranger.system.entity.SysDictData;

/**
 * 字典数据表(SysDictData)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:53
 */
@Repository
public interface SysDictDataDao extends BaseMapper<SysDictData> {
}