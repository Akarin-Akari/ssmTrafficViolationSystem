package com.entity.view;

import com.entity.YidongdianziweizhangxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 移动电子违章信息管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@TableName("yidongdianziweizhangxinxiguanli")
public class YidongdianziweizhangxinxiguanliView  extends YidongdianziweizhangxinxiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YidongdianziweizhangxinxiguanliView(){
	}
 
 	public YidongdianziweizhangxinxiguanliView(YidongdianziweizhangxinxiguanliEntity yidongdianziweizhangxinxiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, yidongdianziweizhangxinxiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
