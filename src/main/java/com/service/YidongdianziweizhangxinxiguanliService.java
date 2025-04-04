package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YidongdianziweizhangxinxiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YidongdianziweizhangxinxiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YidongdianziweizhangxinxiguanliView;


/**
 * 移动电子违章信息管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface YidongdianziweizhangxinxiguanliService extends IService<YidongdianziweizhangxinxiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YidongdianziweizhangxinxiguanliVO> selectListVO(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
   	
   	YidongdianziweizhangxinxiguanliVO selectVO(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
   	
   	List<YidongdianziweizhangxinxiguanliView> selectListView(Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
   	
   	YidongdianziweizhangxinxiguanliView selectView(@Param("ew") Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YidongdianziweizhangxinxiguanliEntity> wrapper);
   	
}

