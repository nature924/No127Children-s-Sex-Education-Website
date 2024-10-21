package com.dao;

import com.entity.JiaoyuwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyuwenzhangVO;
import com.entity.view.JiaoyuwenzhangView;


/**
 * 教育文章
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public interface JiaoyuwenzhangDao extends BaseMapper<JiaoyuwenzhangEntity> {
	
	List<JiaoyuwenzhangVO> selectListVO(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
	
	JiaoyuwenzhangVO selectVO(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
	
	List<JiaoyuwenzhangView> selectListView(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);

	List<JiaoyuwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
	
	JiaoyuwenzhangView selectView(@Param("ew") Wrapper<JiaoyuwenzhangEntity> wrapper);
	

}
