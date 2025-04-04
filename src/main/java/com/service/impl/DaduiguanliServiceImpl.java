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


import com.dao.DaduiguanliDao;
import com.entity.DaduiguanliEntity;
import com.service.DaduiguanliService;
import com.entity.vo.DaduiguanliVO;
import com.entity.view.DaduiguanliView;

@Service("daduiguanliService")
public class DaduiguanliServiceImpl extends ServiceImpl<DaduiguanliDao, DaduiguanliEntity> implements DaduiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaduiguanliEntity> page = this.selectPage(
                new Query<DaduiguanliEntity>(params).getPage(),
                new EntityWrapper<DaduiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaduiguanliEntity> wrapper) {
		  Page<DaduiguanliView> page =new Query<DaduiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaduiguanliVO> selectListVO(Wrapper<DaduiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaduiguanliVO selectVO(Wrapper<DaduiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaduiguanliView> selectListView(Wrapper<DaduiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaduiguanliView selectView(Wrapper<DaduiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
