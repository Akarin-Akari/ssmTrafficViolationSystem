package com.dao;

import com.entity.WeizhangxingweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeizhangxingweiVO;
import com.entity.view.WeizhangxingweiView;


/**
 * 违章行为
 * 
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface WeizhangxingweiDao extends BaseMapper<WeizhangxingweiEntity> {
	
	List<WeizhangxingweiVO> selectListVO(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
	
	WeizhangxingweiVO selectVO(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
	
	List<WeizhangxingweiView> selectListView(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);

	List<WeizhangxingweiView> selectListView(Pagination page,@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
	
	WeizhangxingweiView selectView(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
	
}
