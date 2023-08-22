package com.openclassrooms.starterjwt.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class UserTest {

	private User user;
	private Long id = 1L;
	private String email = "Petit.Jean@mail.com";
	private String lastName = "Petit";
	private String firstName = "Jean";
	private String password = "0000";
	private boolean admin = false;
	private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime updatedAt = LocalDateTime.now();

	@BeforeEach
	public void beforeEach() {
		user = User.builder().id(id).email(email).lastName(lastName).firstName(firstName).password(password)
				.admin(admin).createdAt(createdAt).updatedAt(updatedAt).build();
	}

	@Test
	public void testUserGetterAndSetters() {
		LocalDateTime createdAt2 = LocalDateTime.now();
		LocalDateTime updatedAt2 = LocalDateTime.now();
		user.setCreatedAt(createdAt2);
		user.setUpdatedAt(updatedAt2);
	}

	@Test
	public void testId() {
		Long idTest = 0L;
		user.setId(idTest);

		assertEquals(idTest, user.getId());
	}

	@Test
	public void testMail() {
		String email2 = "franc.emile@mail.com";
		user.setEmail(email2);

		assertEquals(email2, user.getEmail());
	}

	@Test
	public void testLastName() {
		String lastNameTest = "Franc";
		user.setLastName(lastNameTest);

		assertEquals(lastNameTest, user.getLastName());
	}

	@Test
	public void testFirstName() {
		String firstNameTest = "Emile";
		user.setFirstName(firstNameTest);

		assertEquals(firstNameTest, user.getFirstName());
	}

	@Test
	public void testPassword() {
		String password2 = "1234";
		user.setPassword(password2);

		assertEquals(password2, user.getPassword());
	}

	@Test
	public void testAdminBoolean() {
		boolean adminTest = true;
		user.setAdmin(adminTest);

		assertTrue(user.isAdmin());
	}

	@Test
	public void testSetCreatedAt() {
		LocalDateTime nowDateStored = LocalDateTime.now();
		user.setCreatedAt(nowDateStored);

		assertEquals(user.getCreatedAt(), nowDateStored);
	}

	@Test
	public void testSetUpdatedAt() {
		LocalDateTime nowDateStored = LocalDateTime.now();
		user.setUpdatedAt(nowDateStored);

		assertEquals(user.getUpdatedAt(), nowDateStored);
	}

}