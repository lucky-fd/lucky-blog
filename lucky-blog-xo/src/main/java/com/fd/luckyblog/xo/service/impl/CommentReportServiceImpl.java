package com.fd.luckyblog.xo.service.impl;

import com.fd.luckyblog.commons.entity.CommentReport;
import com.fd.luckyblog.xo.mapper.CommentReportMapper;
import com.fd.luckyblog.xo.service.CommentReportService;
import com.fd.luckyblog.base.serviceImpl.SuperServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 评论举报表 服务实现类
 *
 * @author 陌溪
 * @date 2020年1月12日15:47:47
 */
@Service
public class CommentReportServiceImpl extends SuperServiceImpl<CommentReportMapper, CommentReport> implements CommentReportService {

}
