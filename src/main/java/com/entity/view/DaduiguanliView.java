package com.entity.view;

import com.entity.DaduiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 大队管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("daduiguanli")
public class DaduiguanliView  extends DaduiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaduiguanliView(){
	}
 
 	public DaduiguanliView(DaduiguanliEntity daduiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, daduiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
