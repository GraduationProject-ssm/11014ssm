package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinwentougaoDao;
import com.entity.XinwentougaoEntity;
import com.service.XinwentougaoService;
import com.entity.vo.XinwentougaoVO;
import com.entity.view.XinwentougaoView;

@Service("xinwentougaoService")
public class XinwentougaoServiceImpl extends ServiceImpl<XinwentougaoDao, XinwentougaoEntity> implements XinwentougaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwentougaoEntity> page = this.selectPage(
                new Query<XinwentougaoEntity>(params).getPage(),
                new EntityWrapper<XinwentougaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwentougaoEntity> wrapper) {
		  Page<XinwentougaoView> page =new Query<XinwentougaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwentougaoVO> selectListVO(Wrapper<XinwentougaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwentougaoVO selectVO(Wrapper<XinwentougaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwentougaoView> selectListView(Wrapper<XinwentougaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwentougaoView selectView(Wrapper<XinwentougaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
