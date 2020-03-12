package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.dao.SysDictDao;
import tech.ufun.ranger.system.entity.SysDict;
import tech.ufun.ranger.system.service.SysDictService;

/**
 * 字典表service实现
 *
 * @author zhanglei
 * @date 2020/3/12 10:24
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDict> implements SysDictService {
}
