package tech.ufun.ranger.admin.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ufun.ranger.system.entity.SysDict;
import tech.ufun.ranger.system.service.SysDictService;

import java.util.List;

/**
 * 字典表controller
 *
 * @author zhanglei
 * @date 2020/3/12 10:20
 */
@RestController
@RequestMapping("/sys/dict")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @GetMapping("/list")
    public List<SysDict> list() {
        return sysDictService.list();
    }
}
