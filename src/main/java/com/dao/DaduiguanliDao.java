package com.dao;

import com.entity.DaduiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaduiguanliVO;
import com.entity.view.DaduiguanliView;


/**
 * 大队管理
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface DaduiguanliDao extends BaseMapper<DaduiguanliEntity> {
	
	List<DaduiguanliVO> selectListVO(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
	
	DaduiguanliVO selectVO(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
	
	List<DaduiguanliView> selectListView(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);

	List<DaduiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
	
	DaduiguanliView selectView(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
	
}
