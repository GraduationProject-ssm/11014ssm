package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwentougaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwentougaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwentougaoView;


/**
 * 新闻投稿
 *
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
public interface XinwentougaoService extends IService<XinwentougaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwentougaoVO> selectListVO(Wrapper<XinwentougaoEntity> wrapper);
   	
   	XinwentougaoVO selectVO(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
   	
   	List<XinwentougaoView> selectListView(Wrapper<XinwentougaoEntity> wrapper);
   	
   	XinwentougaoView selectView(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwentougaoEntity> wrapper);
   	
}

