package tech.ufun.ranger.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.ranger.system.entity.SysMenu;

/**
 * 菜单表(SysMenu)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:51
 */
@Repository
public interface SysMenuDao extends BaseMapper<SysMenu> {
}