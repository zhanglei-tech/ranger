package tech.ufun.ranger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.ranger.system.entity.SysDictData;
import tech.ufun.ranger.system.dao.SysDictDataDao;
import tech.ufun.ranger.system.service.SysDictDataService;

/**
 * 字典数据表(SysDictData)表服务实现类
 *
 * @author zhanglei
 * @since 2020-03-12 10:57:53
 */
@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataDao, SysDictData> implements SysDictDataService {
}