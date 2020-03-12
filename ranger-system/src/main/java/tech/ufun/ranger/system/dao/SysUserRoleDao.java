package tech.ufun.ranger.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.ranger.system.entity.SysUserRole;

/**
 * 用户角色关联表(SysUserRole)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:53
 */
@Repository
public interface SysUserRoleDao extends BaseMapper<SysUserRole> {
}