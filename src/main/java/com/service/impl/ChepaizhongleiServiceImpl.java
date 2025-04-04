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


import com.dao.ChepaizhongleiDao;
import com.entity.ChepaizhongleiEntity;
import com.service.ChepaizhongleiService;
import com.entity.vo.ChepaizhongleiVO;
import com.entity.view.ChepaizhongleiView;

@Service("chepaizhongleiService")
public class ChepaizhongleiServiceImpl extends ServiceImpl<ChepaizhongleiDao, ChepaizhongleiEntity> implements ChepaizhongleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChepaizhongleiEntity> page = this.selectPage(
                new Query<ChepaizhongleiEntity>(params).getPage(),
                new EntityWrapper<ChepaizhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChepaizhongleiEntity> wrapper) {
		  Page<ChepaizhongleiView> page =new Query<ChepaizhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChepaizhongleiVO> selectListVO(Wrapper<ChepaizhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChepaizhongleiVO selectVO(Wrapper<ChepaizhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChepaizhongleiView> selectListView(Wrapper<ChepaizhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChepaizhongleiView selectView(Wrapper<ChepaizhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
