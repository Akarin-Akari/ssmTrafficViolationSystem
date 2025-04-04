package com.dao;

import com.entity.ChufafangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufafangshiVO;
import com.entity.view.ChufafangshiView;


/**
 * 处罚方式
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChufafangshiDao extends BaseMapper<ChufafangshiEntity> {
	
	List<ChufafangshiVO> selectListVO(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
	
	ChufafangshiVO selectVO(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
	
	List<ChufafangshiView> selectListView(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);

	List<ChufafangshiView> selectListView(Pagination page,@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
	
	ChufafangshiView selectView(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
	
}
