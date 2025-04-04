package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingzhengquhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingzhengquhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingzhengquhuaView;


/**
 * 行政区划
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface XingzhengquhuaService extends IService<XingzhengquhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingzhengquhuaVO> selectListVO(Wrapper<XingzhengquhuaEntity> wrapper);
   	
   	XingzhengquhuaVO selectVO(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
   	
   	List<XingzhengquhuaView> selectListView(Wrapper<XingzhengquhuaEntity> wrapper);
   	
   	XingzhengquhuaView selectView(@Param("ew") Wrapper<XingzhengquhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingzhengquhuaEntity> wrapper);
   	
}

