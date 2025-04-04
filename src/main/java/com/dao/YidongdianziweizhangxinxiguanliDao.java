package com.dao;

import com.entity.YidongdianziweizhangxinxiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YidongdianziweizhangxinxiguanliVO;
import com.entity.view.YidongdianziweizhangxinxiguanliView;


/**
 * 移动电子违章信息管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface YidongdianziweizhangxinxiguanliDao extends BaseMapper<YidongdianziweizhangxinxiguanliEntity> {
	
	List<YidongdianziweizhangxinxiguanliVO> selectListVO(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
	
	YidongdianziweizhangxinxiguanliVO selectVO(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
	
	List<YidongdianziweizhangxinxiguanliView> selectListView(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);

	List<YidongdianziweizhangxinxiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
	
	YidongdianziweizhangxinxiguanliView selectView(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
	
}
