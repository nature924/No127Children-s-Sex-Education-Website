package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyuwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyuwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyuwenzhangView;


/**
 * 教育文章
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public interface JiaoyuwenzhangService extends IService<JiaoyuwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyuwenzhangVO> selectListVO(Wrapper<JiaoyuwenzhangEntity> wrapper);
   	
   	JiaoyuwenzhangVO selectVO(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
   	
   	List<JiaoyuwenzhangView> selectListView(Wrapper<JiaoyuwenzhangEntity> wrapper);
   	
   	JiaoyuwenzhangView selectView(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyuwenzhangEntity> wrapper);
   	

}

