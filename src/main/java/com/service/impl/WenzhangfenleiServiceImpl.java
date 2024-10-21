package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WenzhangfenleiDao;
import com.entity.WenzhangfenleiEntity;
import com.service.WenzhangfenleiService;
import com.entity.vo.WenzhangfenleiVO;
import com.entity.view.WenzhangfenleiView;

@Service("wenzhangfenleiService")
public class WenzhangfenleiServiceImpl extends ServiceImpl<WenzhangfenleiDao, WenzhangfenleiEntity> implements WenzhangfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangfenleiEntity> page = this.selectPage(
                new Query<WenzhangfenleiEntity>(params).getPage(),
                new EntityWrapper<WenzhangfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangfenleiEntity> wrapper) {
		  Page<WenzhangfenleiView> page =new Query<WenzhangfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhangfenleiVO> selectListVO(Wrapper<WenzhangfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangfenleiVO selectVO(Wrapper<WenzhangfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangfenleiView> selectListView(Wrapper<WenzhangfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangfenleiView selectView(Wrapper<WenzhangfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
