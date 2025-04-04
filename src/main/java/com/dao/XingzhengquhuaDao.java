package com.dao;

import com.entity.XingzhengquhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingzhengquhuaVO;
import com.entity.view.XingzhengquhuaView;


/**
 * 行政区划
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface XingzhengquhuaDao extends BaseMapper<XingzhengquhuaEntity> {
	
	List<XingzhengquhuaVO> selectListVO(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
	
	XingzhengquhuaVO selectVO(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
	
	List<XingzhengquhuaView> selectListView(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);

	List<XingzhengquhuaView> selectListView(Pagination page,@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
	
	XingzhengquhuaView selectView(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
	
}
