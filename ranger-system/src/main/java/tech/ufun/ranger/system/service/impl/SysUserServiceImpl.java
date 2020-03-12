package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysUser;
import tech.ufun.ranger.system.dao.SysUserDao;
import tech.ufun.ranger.system.service.SysUserService;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:52
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
}