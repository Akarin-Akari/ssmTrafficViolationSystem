package com.dao;

import com.entity.ZhiduiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiduiguanliVO;
import com.entity.view.ZhiduiguanliView;


/**
 * 支队管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ZhiduiguanliDao extends BaseMapper<ZhiduiguanliEntity> {
	
	List<ZhiduiguanliVO> selectListVO(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
	
	ZhiduiguanliVO selectVO(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
	
	List<ZhiduiguanliView> selectListView(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);

	List<ZhiduiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
	
	ZhiduiguanliView selectView(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
	
}
