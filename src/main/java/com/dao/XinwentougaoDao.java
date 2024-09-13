package com.dao;

import com.entity.XinwentougaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwentougaoVO;
import com.entity.view.XinwentougaoView;


/**
 * 新闻投稿
 * 
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
public interface XinwentougaoDao extends BaseMapper<XinwentougaoEntity> {
	
	List<XinwentougaoVO> selectListVO(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
	
	XinwentougaoVO selectVO(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
	
	List<XinwentougaoView> selectListView(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);

	List<XinwentougaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
	
	XinwentougaoView selectView(@Param("ew") Wrapper<XinwentougaoEntity> wrapper);
	
}
