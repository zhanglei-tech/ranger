package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysRole;
import tech.ufun.ranger.system.dao.SysRoleDao;
import tech.ufun.ranger.system.service.SysRoleService;

/**
 * 角色表(SysRole)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:53
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRole> implements SysRoleService {
}