package com.playjoy.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.playjoy.entity.SysUser;
import com.playjoy.entity.SysUserExample;
import com.playjoy.mapper.SysUserMapper;
import com.playjoy.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * User服务接口实现类
 * Created by cent on 2016/9/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    @Cacheable(value = "usercache",keyGenerator = "wiselyKeyGenerator")
    public SysUser queryById(String id) throws Exception {
        SysUserMapper userMapper = sqlSessionTemplate.getMapper(SysUserMapper.class);
        System.out.println("无缓存的时候调用这里");
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public PageInfo selectPage(int start,int limit) throws Exception {
        SysUserMapper userMapper = sqlSessionTemplate.getMapper(SysUserMapper.class);
        PageHelper.startPage(start, limit);
        SysUserExample ue = new SysUserExample();
        PageInfo users = new PageInfo(userMapper.selectByExample(ue));
        return users;
    }
    @Override
    public void save(SysUser user) throws Exception {
        SysUserMapper userMapper = sqlSessionTemplate.getMapper(SysUserMapper.class);
         userMapper.insert(user);
    }
}