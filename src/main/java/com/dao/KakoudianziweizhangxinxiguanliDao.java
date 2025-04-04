package com.dao;

import com.entity.KakoudianziweizhangxinxiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KakoudianziweizhangxinxiguanliVO;
import com.entity.view.KakoudianziweizhangxinxiguanliView;


/**
 * 卡口电子违章信息管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface KakoudianziweizhangxinxiguanliDao extends BaseMapper<KakoudianziweizhangxinxiguanliEntity> {
	
	List<KakoudianziweizhangxinxiguanliVO> selectListVO(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
	
	KakoudianziweizhangxinxiguanliVO selectVO(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
	
	List<KakoudianziweizhangxinxiguanliView> selectListView(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);

	List<KakoudianziweizhangxinxiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
	
	KakoudianziweizhangxinxiguanliView selectView(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
	
}
