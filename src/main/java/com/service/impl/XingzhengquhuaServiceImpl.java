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


import com.dao.XingzhengquhuaDao;
import com.entity.XingzhengquhuaEntity;
import com.service.XingzhengquhuaService;
import com.entity.vo.XingzhengquhuaVO;
import com.entity.view.XingzhengquhuaView;

@Service("xingzhengquhuaService")
public class XingzhengquhuaServiceImpl extends ServiceImpl<XingzhengquhuaDao, XingzhengquhuaEntity> implements XingzhengquhuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingzhengquhuaEntity> page = this.selectPage(
                new Query<XingzhengquhuaEntity>(params).getPage(),
                new EntityWrapper<XingzhengquhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingzhengquhuaEntity> wrapper) {
		  Page<XingzhengquhuaView> page =new Query<XingzhengquhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingzhengquhuaVO> selectListVO(Wrapper<XingzhengquhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingzhengquhuaVO selectVO(Wrapper<XingzhengquhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingzhengquhuaView> selectListView(Wrapper<XingzhengquhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingzhengquhuaView selectView(Wrapper<XingzhengquhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
