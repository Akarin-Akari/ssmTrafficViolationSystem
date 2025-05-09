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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChepaizhongleiEntity;
import com.entity.view.ChepaizhongleiView;

import com.service.ChepaizhongleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 车牌种类
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-12 16:48:44
 */
@RestController
@RequestMapping("/chepaizhonglei")
public class ChepaizhongleiController {
    @Autowired
    private ChepaizhongleiService chepaizhongleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChepaizhongleiEntity chepaizhonglei, 
		HttpServletRequest request){

        EntityWrapper<ChepaizhongleiEntity> ew = new EntityWrapper<ChepaizhongleiEntity>();
		PageUtils page = chepaizhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chepaizhonglei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChepaizhongleiEntity chepaizhonglei, HttpServletRequest request){
        EntityWrapper<ChepaizhongleiEntity> ew = new EntityWrapper<ChepaizhongleiEntity>();
		PageUtils page = chepaizhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chepaizhonglei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChepaizhongleiEntity chepaizhonglei){
       	EntityWrapper<ChepaizhongleiEntity> ew = new EntityWrapper<ChepaizhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chepaizhonglei, "chepaizhonglei")); 
        return R.ok().put("data", chepaizhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChepaizhongleiEntity chepaizhonglei){
        EntityWrapper< ChepaizhongleiEntity> ew = new EntityWrapper< ChepaizhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chepaizhonglei, "chepaizhonglei")); 
		ChepaizhongleiView chepaizhongleiView =  chepaizhongleiService.selectView(ew);
		return R.ok("查询车牌种类成功").put("data", chepaizhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChepaizhongleiEntity chepaizhonglei = chepaizhongleiService.selectById(id);
        return R.ok().put("data", chepaizhonglei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChepaizhongleiEntity chepaizhonglei = chepaizhongleiService.selectById(id);
        return R.ok().put("data", chepaizhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChepaizhongleiEntity chepaizhonglei, HttpServletRequest request){
    	chepaizhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chepaizhonglei);

        chepaizhongleiService.insert(chepaizhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChepaizhongleiEntity chepaizhonglei, HttpServletRequest request){
    	chepaizhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chepaizhonglei);

        chepaizhongleiService.insert(chepaizhonglei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChepaizhongleiEntity chepaizhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chepaizhonglei);
        chepaizhongleiService.updateById(chepaizhonglei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chepaizhongleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChepaizhongleiEntity> wrapper = new EntityWrapper<ChepaizhongleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chepaizhongleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
