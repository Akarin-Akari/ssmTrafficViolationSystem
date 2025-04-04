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


import com.dao.XingshifangxiangDao;
import com.entity.XingshifangxiangEntity;
import com.service.XingshifangxiangService;
import com.entity.vo.XingshifangxiangVO;
import com.entity.view.XingshifangxiangView;

@Service("xingshifangxiangService")
public class XingshifangxiangServiceImpl extends ServiceImpl<XingshifangxiangDao, XingshifangxiangEntity> implements XingshifangxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingshifangxiangEntity> page = this.selectPage(
                new Query<XingshifangxiangEntity>(params).getPage(),
                new EntityWrapper<XingshifangxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingshifangxiangEntity> wrapper) {
		  Page<XingshifangxiangView> page =new Query<XingshifangxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingshifangxiangVO> selectListVO(Wrapper<XingshifangxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingshifangxiangVO selectVO(Wrapper<XingshifangxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingshifangxiangView> selectListView(Wrapper<XingshifangxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingshifangxiangView selectView(Wrapper<XingshifangxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
