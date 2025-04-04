package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufafangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufafangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufafangshiView;


/**
 * 处罚方式
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChufafangshiService extends IService<ChufafangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufafangshiVO> selectListVO(Wrapper<ChufafangshiEntity> wrapper);
   	
   	ChufafangshiVO selectVO(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
   	
   	List<ChufafangshiView> selectListView(Wrapper<ChufafangshiEntity> wrapper);
   	
   	ChufafangshiView selectView(@Param("ew") Wrapper<ChufafangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufafangshiEntity> wrapper);
   	
}

