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


import com.dao.JiaoyuwenzhangDao;
import com.entity.JiaoyuwenzhangEntity;
import com.service.JiaoyuwenzhangService;
import com.entity.vo.JiaoyuwenzhangVO;
import com.entity.view.JiaoyuwenzhangView;

@Service("jiaoyuwenzhangService")
public class JiaoyuwenzhangServiceImpl extends ServiceImpl<JiaoyuwenzhangDao, JiaoyuwenzhangEntity> implements JiaoyuwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyuwenzhangEntity> page = this.selectPage(
                new Query<JiaoyuwenzhangEntity>(params).getPage(),
                new EntityWrapper<JiaoyuwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyuwenzhangEntity> wrapper) {
		  Page<JiaoyuwenzhangView> page =new Query<JiaoyuwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyuwenzhangVO> selectListVO(Wrapper<JiaoyuwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyuwenzhangVO selectVO(Wrapper<JiaoyuwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyuwenzhangView> selectListView(Wrapper<JiaoyuwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyuwenzhangView selectView(Wrapper<JiaoyuwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
