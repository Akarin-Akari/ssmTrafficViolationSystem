package com.entity.view;

import com.entity.ChufajuedingshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 处罚决定书
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("chufajuedingshu")
public class ChufajuedingshuView  extends ChufajuedingshuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufajuedingshuView(){
	}
 
 	public ChufajuedingshuView(ChufajuedingshuEntity chufajuedingshuEntity){
 	try {
			BeanUtils.copyProperties(this, chufajuedingshuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
