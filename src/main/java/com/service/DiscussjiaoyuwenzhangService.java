package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoyuwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoyuwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoyuwenzhangView;


/**
 * 教育文章评论表
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public interface DiscussjiaoyuwenzhangService extends IService<DiscussjiaoyuwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoyuwenzhangVO> selectListVO(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
   	
   	DiscussjiaoyuwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
   	
   	List<DiscussjiaoyuwenzhangView> selectListView(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
   	
   	DiscussjiaoyuwenzhangView selectView(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
   	

}

