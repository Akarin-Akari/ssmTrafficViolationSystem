package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufajuedingshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufajuedingshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufajuedingshuView;


/**
 * 处罚决定书
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChufajuedingshuService extends IService<ChufajuedingshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufajuedingshuVO> selectListVO(Wrapper<ChufajuedingshuEntity> wrapper);
   	
   	ChufajuedingshuVO selectVO(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
   	
   	List<ChufajuedingshuView> selectListView(Wrapper<ChufajuedingshuEntity> wrapper);
   	
   	ChufajuedingshuView selectView(@Param("ew") Wrapper<ChufajuedingshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufajuedingshuEntity> wrapper);
   	
}

