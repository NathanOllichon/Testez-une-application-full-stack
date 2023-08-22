package com.openclassrooms.starterjwt.mapper;

import com.openclassrooms.starterjwt.dto.UserDto;
import com.openclassrooms.starterjwt.models.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

public class TestUserMapper {

	private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);
	private User userEntity = new User();

	@BeforeEach
	public void beforeEach() {
		this.userEntity = userEntity.setId(10L).setEmail("testUser@yopmail.com").setLastName("test")
				.setFirstName("user").setPassword("0000").setAdmin(true);
	}

	@Test
	public void testToEntityUser() {
		UserDto userDto = new UserDto();
		userDto.setId(1L);
		userDto.setEmail("test@mail.com");
		userDto.setLastName("Doe");
		userDto.setFirstName("John");
		userDto.setPassword("password");
		userDto.setAdmin(true);

		User user = userMapper.toEntity(userDto);

		assertNotNull(user);
		assertEquals(userDto.getId(), user.getId());
		assertEquals(userDto.getEmail(), user.getEmail());
		assertEquals(userDto.getLastName(), user.getLastName());
		assertEquals(userDto.getFirstName(), user.getFirstName());
		assertEquals(userDto.getPassword(), user.getPassword());
		assertEquals(userDto.isAdmin(), user.isAdmin());
	}

	@Test
	public void testToDtoUser() {

		UserDto userDto = userMapper.toDto(this.userEntity);

		assertEquals(this.userEntity.getId(), userDto.getId());
		assertEquals(this.userEntity.getEmail(), userDto.getEmail());
		assertEquals(this.userEntity.getLastName(), userDto.getLastName());
		assertEquals(this.userEntity.getFirstName(), userDto.getFirstName());
		assertEquals(this.userEntity.getPassword(), userDto.getPassword());
		assertEquals(this.userEntity.isAdmin(), userDto.isAdmin());
	}

	@Test
	public void testToEntityList() {
		UserDto userDto = new UserDto();
		userDto.setId(1L);
		userDto.setEmail("test@mail.com");
		userDto.setLastName("Doe");
		userDto.setFirstName("John");
		userDto.setPassword("password");
		userDto.setAdmin(true);
		List<UserDto> userDtoList = new ArrayList<UserDto>();
		userDtoList.add(userDto);

		List<User> userList = userMapper.toEntity(userDtoList);

		assertNotNull(userList);
		assertEquals(userList.get(0).getId(), userDtoList.get(0).getId());

	}

	@Test
	public void testToDtoList() {

		List<User> userList = new ArrayList<User>();
		userList.add(this.userEntity);

		List<UserDto> userDtoList = userMapper.toDto(userList);

		assertEquals(userList.get(0).getId(), userDtoList.get(0).getId());
	}
}