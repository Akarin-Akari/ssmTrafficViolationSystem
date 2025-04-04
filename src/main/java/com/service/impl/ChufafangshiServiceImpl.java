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


import com.dao.ChufafangshiDao;
import com.entity.ChufafangshiEntity;
import com.service.ChufafangshiService;
import com.entity.vo.ChufafangshiVO;
import com.entity.view.ChufafangshiView;

@Service("chufafangshiService")
public class ChufafangshiServiceImpl extends ServiceImpl<ChufafangshiDao, ChufafangshiEntity> implements ChufafangshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufafangshiEntity> page = this.selectPage(
                new Query<ChufafangshiEntity>(params).getPage(),
                new EntityWrapper<ChufafangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufafangshiEntity> wrapper) {
		  Page<ChufafangshiView> page =new Query<ChufafangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufafangshiVO> selectListVO(Wrapper<ChufafangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufafangshiVO selectVO(Wrapper<ChufafangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufafangshiView> selectListView(Wrapper<ChufafangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufafangshiView selectView(Wrapper<ChufafangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
