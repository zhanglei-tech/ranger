package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysRoleMenu;
import tech.ufun.ranger.system.dao.SysRoleMenuDao;
import tech.ufun.ranger.system.service.SysRoleMenuService;

/**
 * 角色菜单关联表(SysRoleMenu)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:51
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenu> implements SysRoleMenuService {
}