package com.yaocheng.star_user.service.impl;

import com.yaocheng.star_user.pojo.entity.User;
import com.yaocheng.star_user.mapper.UserMapper;
import com.yaocheng.star_user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yaocheng
 * @since 2024-04-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
