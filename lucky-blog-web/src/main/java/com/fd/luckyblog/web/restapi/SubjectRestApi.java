package com.fd.luckyblog.web.restapi;

import com.fd.luckyblog.utils.ResultUtil;
import com.fd.luckyblog.web.global.SysConf;
import com.fd.luckyblog.xo.service.SubjectItemService;
import com.fd.luckyblog.xo.service.SubjectService;
import com.fd.luckyblog.xo.vo.SubjectItemVO;
import com.fd.luckyblog.xo.vo.SubjectVO;
import com.fd.luckyblog.base.exception.ThrowableUtils;
import com.fd.luckyblog.base.validator.group.GetList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 专题表 RestApi
 *
 * @author 陌溪
 * @since 2020年8月24日10:37:39
 */
@Api(value = "专题相关接口", tags = {"专题相关接口"})
@RestController
@RequestMapping("/subject")
@Slf4j
public class SubjectRestApi {

    @Autowired
    SubjectService subjectService;

    @Autowired
    SubjectItemService subjectItemService;

    @ApiOperation(value = "获取专题列表", notes = "获取专题列表", response = String.class)
    @PostMapping("/getList")
    public String getList(@Validated({GetList.class}) @RequestBody SubjectVO subjectVO, BindingResult result) {

        ThrowableUtils.checkParamArgument(result);
        return ResultUtil.result(SysConf.SUCCESS, subjectService.getPageList(subjectVO));
    }

    @ApiOperation(value = "获取专题Item列表", notes = "获取专题Item列表", response = String.class)
    @PostMapping("/getItemList")
    public String getItemList(@Validated({GetList.class}) @RequestBody SubjectItemVO subjectItemVO, BindingResult result) {

        ThrowableUtils.checkParamArgument(result);
        return ResultUtil.result(SysConf.SUCCESS, subjectItemService.getPageList(subjectItemVO));
    }

}

