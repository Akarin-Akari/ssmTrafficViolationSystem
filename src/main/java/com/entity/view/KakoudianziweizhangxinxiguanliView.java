package com.entity.view;

import com.entity.KakoudianziweizhangxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卡口电子违章信息管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("kakoudianziweizhangxinxiguanli")
public class KakoudianziweizhangxinxiguanliView  extends KakoudianziweizhangxinxiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KakoudianziweizhangxinxiguanliView(){
	}
 
 	public KakoudianziweizhangxinxiguanliView(KakoudianziweizhangxinxiguanliEntity kakoudianziweizhangxinxiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, kakoudianziweizhangxinxiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
