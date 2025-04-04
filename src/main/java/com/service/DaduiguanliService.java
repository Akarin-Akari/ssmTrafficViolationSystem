package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaduiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaduiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaduiguanliView;


/**
 * 大队管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface DaduiguanliService extends IService<DaduiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaduiguanliVO> selectListVO(Wrapper<DaduiguanliEntity> wrapper);
   	
   	DaduiguanliVO selectVO(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
   	
   	List<DaduiguanliView> selectListView(Wrapper<DaduiguanliEntity> wrapper);
   	
   	DaduiguanliView selectView(@Param("ew") Wrapper<DaduiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaduiguanliEntity> wrapper);
   	
}

