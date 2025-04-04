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


import com.dao.YidongdianziweizhangxinxiguanliDao;
import com.entity.YidongdianziweizhangxinxiguanliEntity;
import com.service.YidongdianziweizhangxinxiguanliService;
import com.entity.vo.YidongdianziweizhangxinxiguanliVO;
import com.entity.view.YidongdianziweizhangxinxiguanliView;

@Service("yidongdianziweizhangxinxiguanliService")
public class YidongdianziweizhangxinxiguanliServiceImpl extends ServiceImpl<YidongdianziweizhangxinxiguanliDao, YidongdianziweizhangxinxiguanliEntity> implements YidongdianziweizhangxinxiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YidongdianziweizhangxinxiguanliEntity> page = this.selectPage(
                new Query<YidongdianziweizhangxinxiguanliEntity>(params).getPage(),
                new EntityWrapper<YidongdianziweizhangxinxiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper) {
		  Page<YidongdianziweizhangxinxiguanliView> page =new Query<YidongdianziweizhangxinxiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YidongdianziweizhangxinxiguanliVO> selectListVO(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YidongdianziweizhangxinxiguanliVO selectVO(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YidongdianziweizhangxinxiguanliView> selectListView(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YidongdianziweizhangxinxiguanliView selectView(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
