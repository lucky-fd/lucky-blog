package com.fd.luckyblog.spider.service.impl;


import com.fd.luckyblog.spider.entity.BlogSpider;
import com.fd.luckyblog.spider.mapper.BlogSpiderMapper;
import com.fd.luckyblog.spider.service.BlogSpiderService;
import com.fd.luckyblog.base.serviceImpl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客爬取服务实现类
 * </p>
 *
 * @author 陌溪
 * @since 2020年2月7日21:29:42
 */
@Slf4j
@Service
public class BlogSpiderServiceImpl extends SuperServiceImpl<BlogSpiderMapper, BlogSpider> implements BlogSpiderService {

}
