package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysMenu;
import tech.ufun.ranger.system.dao.SysMenuDao;
import tech.ufun.ranger.system.service.SysMenuService;

/**
 * 菜单表(SysMenu)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:52
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenu> implements SysMenuService {
}