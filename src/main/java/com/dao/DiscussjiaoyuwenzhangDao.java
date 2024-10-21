package com.dao;

import com.entity.DiscussjiaoyuwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaoyuwenzhangVO;
import com.entity.view.DiscussjiaoyuwenzhangView;


/**
 * 教育文章评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public interface DiscussjiaoyuwenzhangDao extends BaseMapper<DiscussjiaoyuwenzhangEntity> {
	
	List<DiscussjiaoyuwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
	
	DiscussjiaoyuwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
	
	List<DiscussjiaoyuwenzhangView> selectListView(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);

	List<DiscussjiaoyuwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
	
	DiscussjiaoyuwenzhangView selectView(@Param("ew") Wrapper<DiscussjiaoyuwenzhangEntity> wrapper);
	

}
