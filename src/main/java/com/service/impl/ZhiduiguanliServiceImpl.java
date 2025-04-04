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


import com.dao.ZhiduiguanliDao;
import com.entity.ZhiduiguanliEntity;
import com.service.ZhiduiguanliService;
import com.entity.vo.ZhiduiguanliVO;
import com.entity.view.ZhiduiguanliView;

@Service("zhiduiguanliService")
public class ZhiduiguanliServiceImpl extends ServiceImpl<ZhiduiguanliDao, ZhiduiguanliEntity> implements ZhiduiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiduiguanliEntity> page = this.selectPage(
                new Query<ZhiduiguanliEntity>(params).getPage(),
                new EntityWrapper<ZhiduiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiduiguanliEntity> wrapper) {
		  Page<ZhiduiguanliView> page =new Query<ZhiduiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiduiguanliVO> selectListVO(Wrapper<ZhiduiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiduiguanliVO selectVO(Wrapper<ZhiduiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiduiguanliView> selectListView(Wrapper<ZhiduiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiduiguanliView selectView(Wrapper<ZhiduiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
