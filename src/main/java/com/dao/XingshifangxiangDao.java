package com.dao;

import com.entity.XingshifangxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingshifangxiangVO;
import com.entity.view.XingshifangxiangView;


/**
 * 行驶方向
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface XingshifangxiangDao extends BaseMapper<XingshifangxiangEntity> {
	
	List<XingshifangxiangVO> selectListVO(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
	
	XingshifangxiangVO selectVO(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
	
	List<XingshifangxiangView> selectListView(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);

	List<XingshifangxiangView> selectListView(Pagination page,@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
	
	XingshifangxiangView selectView(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
	
}
