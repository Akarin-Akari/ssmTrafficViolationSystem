package com.entity.view;

import com.entity.WeizhangxingweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 违章行为
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("weizhangxingwei")
public class WeizhangxingweiView  extends WeizhangxingweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeizhangxingweiView(){
	}
 
 	public WeizhangxingweiView(WeizhangxingweiEntity weizhangxingweiEntity){
 	try {
			BeanUtils.copyProperties(this, weizhangxingweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
