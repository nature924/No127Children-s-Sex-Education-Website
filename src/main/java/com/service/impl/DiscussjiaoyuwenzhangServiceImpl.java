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


import com.dao.DiscussjiaoyuwenzhangDao;
import com.entity.DiscussjiaoyuwenzhangEntity;
import com.service.DiscussjiaoyuwenzhangService;
import com.entity.vo.DiscussjiaoyuwenzhangVO;
import com.entity.view.DiscussjiaoyuwenzhangView;

@Service("discussjiaoyuwenzhangService")
public class DiscussjiaoyuwenzhangServiceImpl extends ServiceImpl<DiscussjiaoyuwenzhangDao, DiscussjiaoyuwenzhangEntity> implements DiscussjiaoyuwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoyuwenzhangEntity> page = this.selectPage(
                new Query<DiscussjiaoyuwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoyuwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoyuwenzhangEntity> wrapper) {
		  Page<DiscussjiaoyuwenzhangView> page =new Query<DiscussjiaoyuwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaoyuwenzhangVO> selectListVO(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoyuwenzhangVO selectVO(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoyuwenzhangView> selectListView(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoyuwenzhangView selectView(Wrapper<DiscussjiaoyuwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
