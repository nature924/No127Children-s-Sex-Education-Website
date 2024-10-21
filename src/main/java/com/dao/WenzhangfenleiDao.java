package com.dao;

import com.entity.WenzhangfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangfenleiVO;
import com.entity.view.WenzhangfenleiView;


/**
 * 文章分类
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
public interface WenzhangfenleiDao extends BaseMapper<WenzhangfenleiEntity> {
	
	List<WenzhangfenleiVO> selectListVO(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
	
	WenzhangfenleiVO selectVO(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
	
	List<WenzhangfenleiView> selectListView(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);

	List<WenzhangfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
	
	WenzhangfenleiView selectView(@Param("ew") Wrapper<WenzhangfenleiEntity> wrapper);
	

}
