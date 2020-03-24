package com.waitfor.usercenter;

import java.util.Date;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waitfor.usercenter.dao.user.UserMapper;
import com.waitfor.usercenter.domain.entity.user.User;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

	private final UserMapper userMapper;
	@GetMapping("/test")
	public User testInsert(){
		User user = new User();
		user.setAvatarUrl("xxx");
		user.setBonus(100);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		this.userMapper.insertSelective(user);
		return user;
	}
}
