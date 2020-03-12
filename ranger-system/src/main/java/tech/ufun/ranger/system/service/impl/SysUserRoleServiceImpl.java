package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysUserRole;
import tech.ufun.ranger.system.dao.SysUserRoleDao;
import tech.ufun.ranger.system.service.SysUserRoleService;

/**
 * 用户角色关联表(SysUserRole)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:54
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRole> implements SysUserRoleService {
}