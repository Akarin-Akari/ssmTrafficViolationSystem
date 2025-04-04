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


import com.dao.WeizhangxingweiDao;
import com.entity.WeizhangxingweiEntity;
import com.service.WeizhangxingweiService;
import com.entity.vo.WeizhangxingweiVO;
import com.entity.view.WeizhangxingweiView;

@Service("weizhangxingweiService")
public class WeizhangxingweiServiceImpl extends ServiceImpl<WeizhangxingweiDao, WeizhangxingweiEntity> implements WeizhangxingweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeizhangxingweiEntity> page = this.selectPage(
                new Query<WeizhangxingweiEntity>(params).getPage(),
                new EntityWrapper<WeizhangxingweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeizhangxingweiEntity> wrapper) {
		  Page<WeizhangxingweiView> page =new Query<WeizhangxingweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeizhangxingweiVO> selectListVO(Wrapper<WeizhangxingweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeizhangxingweiVO selectVO(Wrapper<WeizhangxingweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeizhangxingweiView> selectListView(Wrapper<WeizhangxingweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeizhangxingweiView selectView(Wrapper<WeizhangxingweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
