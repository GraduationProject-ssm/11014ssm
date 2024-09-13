package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinwentougaoEntity;
import com.entity.view.XinwentougaoView;

import com.service.XinwentougaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 新闻投稿
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 23:27:29
 */
@RestController
@RequestMapping("/xinwentougao")
public class XinwentougaoController {
    @Autowired
    private XinwentougaoService xinwentougaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinwentougaoEntity xinwentougao, HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		xinwentougao.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<XinwentougaoEntity> ew = new EntityWrapper<XinwentougaoEntity>();
    	PageUtils page = xinwentougaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwentougao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinwentougaoEntity xinwentougao, HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		xinwentougao.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<XinwentougaoEntity> ew = new EntityWrapper<XinwentougaoEntity>();
    	PageUtils page = xinwentougaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwentougao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinwentougaoEntity xinwentougao){
       	EntityWrapper<XinwentougaoEntity> ew = new EntityWrapper<XinwentougaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinwentougao, "xinwentougao")); 
        return R.ok().put("data", xinwentougaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinwentougaoEntity xinwentougao){
        EntityWrapper< XinwentougaoEntity> ew = new EntityWrapper< XinwentougaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinwentougao, "xinwentougao")); 
		XinwentougaoView xinwentougaoView =  xinwentougaoService.selectView(ew);
		return R.ok("查询新闻投稿成功").put("data", xinwentougaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        XinwentougaoEntity xinwentougao = xinwentougaoService.selectById(id);
        return R.ok().put("data", xinwentougao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        XinwentougaoEntity xinwentougao = xinwentougaoService.selectById(id);
        return R.ok().put("data", xinwentougao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinwentougaoEntity xinwentougao, HttpServletRequest request){
    	xinwentougao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwentougao);
    	xinwentougao.setUserid((Long)request.getSession().getAttribute("userId"));

        xinwentougaoService.insert(xinwentougao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinwentougaoEntity xinwentougao, HttpServletRequest request){
    	xinwentougao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwentougao);
    	xinwentougao.setUserid((Long)request.getSession().getAttribute("userId"));

        xinwentougaoService.insert(xinwentougao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinwentougaoEntity xinwentougao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinwentougao);
        xinwentougaoService.updateById(xinwentougao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinwentougaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinwentougaoEntity> wrapper = new EntityWrapper<XinwentougaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}


		int count = xinwentougaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
