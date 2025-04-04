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


import com.dao.KakoudianziweizhangxinxiguanliDao;
import com.entity.KakoudianziweizhangxinxiguanliEntity;
import com.service.KakoudianziweizhangxinxiguanliService;
import com.entity.vo.KakoudianziweizhangxinxiguanliVO;
import com.entity.view.KakoudianziweizhangxinxiguanliView;

@Service("kakoudianziweizhangxinxiguanliService")
public class KakoudianziweizhangxinxiguanliServiceImpl extends ServiceImpl<KakoudianziweizhangxinxiguanliDao, KakoudianziweizhangxinxiguanliEntity> implements KakoudianziweizhangxinxiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KakoudianziweizhangxinxiguanliEntity> page = this.selectPage(
                new Query<KakoudianziweizhangxinxiguanliEntity>(params).getPage(),
                new EntityWrapper<KakoudianziweizhangxinxiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper) {
		  Page<KakoudianziweizhangxinxiguanliView> page =new Query<KakoudianziweizhangxinxiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KakoudianziweizhangxinxiguanliVO> selectListVO(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KakoudianziweizhangxinxiguanliVO selectVO(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KakoudianziweizhangxinxiguanliView> selectListView(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KakoudianziweizhangxinxiguanliView selectView(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
