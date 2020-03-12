package tech.ufun.ranger.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.ranger.system.entity.SysUser;

/**
 * 用户表(SysUser)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:52
 */
@Repository
public interface SysUserDao extends BaseMapper<SysUser> {
}