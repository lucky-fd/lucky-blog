package com.moxi.mogublog.xo.vo;

import com.fd.luckyblog.base.validator.annotion.IntegerNotNull;
import com.fd.luckyblog.base.validator.annotion.NotBlank;
import com.fd.luckyblog.base.validator.group.Insert;
import com.fd.luckyblog.base.validator.group.Update;
import com.fd.luckyblog.base.vo.BaseVO;
import lombok.Data;

/**
 * SubjectItemVO
 *
 * @author: 陌溪
 * @create: 2020年8月22日21:53:40
 */
@Data
public class SubjectItemVO extends BaseVO<SubjectItemVO> {

    /**
     * 专题UID
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String subjectUid;

    /**
     * 博客UID
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String blogUid;

    /**
     * 排序字段，数值越大，越靠前
     */
    @IntegerNotNull(groups = {Insert.class, Update.class})
    private int sort;

}
