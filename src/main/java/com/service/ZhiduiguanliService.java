package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiduiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiduiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiduiguanliView;


/**
 * 支队管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface ZhiduiguanliService extends IService<ZhiduiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiduiguanliVO> selectListVO(Wrapper<ZhiduiguanliEntity> wrapper);
   	
   	ZhiduiguanliVO selectVO(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
   	
   	List<ZhiduiguanliView> selectListView(Wrapper<ZhiduiguanliEntity> wrapper);
   	
   	ZhiduiguanliView selectView(@Param("ew") Wrapper<ZhiduiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiduiguanliEntity> wrapper);
   	
}

