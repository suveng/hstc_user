package com.school.user.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * description:
 * @author suwenguang
 * @version 1.0.0
 **/
@Data
@Document(collection = "user")
public class User {
	@Id
	private String userId;
	@Indexed(unique = true)
	private String phone;

	@Indexed(unique = true)
	private String qq;

	@Indexed(unique = true)
	private String wechat;

	private String name;

	private Integer sex;

	private String address;
}
