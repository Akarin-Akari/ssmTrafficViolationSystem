package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KakoudianziweizhangxinxiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KakoudianziweizhangxinxiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KakoudianziweizhangxinxiguanliView;


/**
 * 卡口电子违章信息管理
 *
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
public interface KakoudianziweizhangxinxiguanliService extends IService<KakoudianziweizhangxinxiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KakoudianziweizhangxinxiguanliVO> selectListVO(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
   	
   	KakoudianziweizhangxinxiguanliVO selectVO(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
   	
   	List<KakoudianziweizhangxinxiguanliView> selectListView(Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
   	
   	KakoudianziweizhangxinxiguanliView selectView(@Param("ew") Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KakoudianziweizhangxinxiguanliEntity> wrapper);
   	
}

