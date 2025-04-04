package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingshifangxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingshifangxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingshifangxiangView;


/**
 * 行驶方向
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface XingshifangxiangService extends IService<XingshifangxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingshifangxiangVO> selectListVO(Wrapper<XingshifangxiangEntity> wrapper);
   	
   	XingshifangxiangVO selectVO(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
   	
   	List<XingshifangxiangView> selectListView(Wrapper<XingshifangxiangEntity> wrapper);
   	
   	XingshifangxiangView selectView(@Param("ew") Wrapper<XingshifangxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingshifangxiangEntity> wrapper);
   	
}

