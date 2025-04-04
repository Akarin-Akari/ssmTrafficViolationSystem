package com.dao;

import com.entity.ChepaizhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChepaizhongleiVO;
import com.entity.view.ChepaizhongleiView;


/**
 * 车牌种类
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChepaizhongleiDao extends BaseMapper<ChepaizhongleiEntity> {
	
	List<ChepaizhongleiVO> selectListVO(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
	
	ChepaizhongleiVO selectVO(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
	
	List<ChepaizhongleiView> selectListView(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);

	List<ChepaizhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
	
	ChepaizhongleiView selectView(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
	
}
