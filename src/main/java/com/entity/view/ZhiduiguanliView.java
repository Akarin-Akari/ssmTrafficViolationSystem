package com.entity.view;

import com.entity.ZhiduiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支队管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("zhiduiguanli")
public class ZhiduiguanliView  extends ZhiduiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiduiguanliView(){
	}
 
 	public ZhiduiguanliView(ZhiduiguanliEntity zhiduiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, zhiduiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
