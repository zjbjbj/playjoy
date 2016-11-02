package com.playjoy.service;

import com.github.pagehelper.PageInfo;
import com.playjoy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by asus on 2016/10/21.
 */
@Service
public interface  UserService {

    /**
     * 根据ID查找
     * @return
     * @throws Exception
     */
    public SysUser queryById(String id) throws Exception;
    /**
     * 获取分页数据
     * @param start
     * @param limit
     * @return
     * @throws Exception
     */
    public PageInfo selectPage(int start,int limit) throws Exception;


    /**
     * 保存
     * @throws Exception
     */
    public void save(SysUser user) throws Exception;
}




