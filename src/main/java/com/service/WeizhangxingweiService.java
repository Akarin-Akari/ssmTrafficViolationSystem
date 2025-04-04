package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeizhangxingweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeizhangxingweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeizhangxingweiView;


/**
 * 违章行为
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface WeizhangxingweiService extends IService<WeizhangxingweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeizhangxingweiVO> selectListVO(Wrapper<WeizhangxingweiEntity> wrapper);
   	
   	WeizhangxingweiVO selectVO(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
   	
   	List<WeizhangxingweiView> selectListView(Wrapper<WeizhangxingweiEntity> wrapper);
   	
   	WeizhangxingweiView selectView(@Param("ew") Wrapper<WeizhangxingweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeizhangxingweiEntity> wrapper);
   	
}

