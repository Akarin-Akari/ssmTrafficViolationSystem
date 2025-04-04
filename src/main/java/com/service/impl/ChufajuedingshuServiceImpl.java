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


import com.dao.ChufajuedingshuDao;
import com.entity.ChufajuedingshuEntity;
import com.service.ChufajuedingshuService;
import com.entity.vo.ChufajuedingshuVO;
import com.entity.view.ChufajuedingshuView;

@Service("chufajuedingshuService")
public class ChufajuedingshuServiceImpl extends ServiceImpl<ChufajuedingshuDao, ChufajuedingshuEntity> implements ChufajuedingshuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufajuedingshuEntity> page = this.selectPage(
                new Query<ChufajuedingshuEntity>(params).getPage(),
                new EntityWrapper<ChufajuedingshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufajuedingshuEntity> wrapper) {
		  Page<ChufajuedingshuView> page =new Query<ChufajuedingshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufajuedingshuVO> selectListVO(Wrapper<ChufajuedingshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufajuedingshuVO selectVO(Wrapper<ChufajuedingshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufajuedingshuView> selectListView(Wrapper<ChufajuedingshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufajuedingshuView selectView(Wrapper<ChufajuedingshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
