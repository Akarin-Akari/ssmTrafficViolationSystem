package com.dao;

import com.entity.ChufajuedingshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufajuedingshuVO;
import com.entity.view.ChufajuedingshuView;


/**
 * 处罚决定书
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChufajuedingshuDao extends BaseMapper<ChufajuedingshuEntity> {
	
	List<ChufajuedingshuVO> selectListVO(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
	
	ChufajuedingshuVO selectVO(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
	
	List<ChufajuedingshuView> selectListView(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);

	List<ChufajuedingshuView> selectListView(Pagination page,@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
	
	ChufajuedingshuView selectView(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
	
}
