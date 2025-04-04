package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChepaizhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChepaizhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChepaizhongleiView;


/**
 * 车牌种类
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ChepaizhongleiService extends IService<ChepaizhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChepaizhongleiVO> selectListVO(Wrapper<ChepaizhongleiEntity> wrapper);
   	
   	ChepaizhongleiVO selectVO(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
   	
   	List<ChepaizhongleiView> selectListView(Wrapper<ChepaizhongleiEntity> wrapper);
   	
   	ChepaizhongleiView selectView(@Param("ew") Wrapper<ChepaizhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChepaizhongleiEntity> wrapper);
   	
}

