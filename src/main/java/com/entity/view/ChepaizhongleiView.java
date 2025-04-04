package com.entity.view;

import com.entity.ChepaizhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车牌种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("chepaizhonglei")
public class ChepaizhongleiView  extends ChepaizhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChepaizhongleiView(){
	}
 
 	public ChepaizhongleiView(ChepaizhongleiEntity chepaizhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, chepaizhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
