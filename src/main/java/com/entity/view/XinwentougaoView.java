package com.entity.view;

import com.entity.XinwentougaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻投稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
@TableName("xinwentougao")
public class XinwentougaoView  extends XinwentougaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwentougaoView(){
	}
 
 	public XinwentougaoView(XinwentougaoEntity xinwentougaoEntity){
 	try {
			BeanUtils.copyProperties(this, xinwentougaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
