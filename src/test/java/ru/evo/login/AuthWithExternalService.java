package ru.evo.login;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Форма авторизации")
@Story("Использование внешних сервисов для авторизации")
@DisplayName("Авторизация через внешние сервисы")
public class AuthWithExternalService {

    @Test
    @Owner("kanikeev")
    @Severity(SeverityLevel.CRITICAL)
    @Tags({@Tag("UI"), @Tag("Smoke")})
    @DisplayName("Google авторизация")
    public void authWithGoogle() {
        step("Открыть https://example.com");
        step("Нажать кнопку \"Авторизация\"");
        step("Нажать кнопку \"Авторизоваться с Google\"");
        step("Авторизоваться под тестовым пользоваетелем", () -> {
            step("Ввести логин testUser");
            step("Ввести пароль testPassword");
            step("Нажать кнопку \"Войти\"");
        });

        step("Проверить, что открылась страница https://example.com");
        step("Проверить профиль пользователя", () -> {
            step("Имя test");
            step("Логин testUser");
            step("Аватар");
        });
    }

    @Test
    @Owner("kanikeev")
    @Severity(SeverityLevel.CRITICAL)
    @Tags({@Tag("UI"), @Tag("Smoke")})
    @DisplayName("AppleID авторизация")
    public void authWithAppleId() {
        step("Открыть https://example.com");
        step("Нажать кнопку \"Авторизация\"");
        step("Нажать кнопку \"Авторизоваться с AppleID\"");
        step("Авторизоваться под тестовым пользоваетелем", () -> {
            step("Ввести логин testUser@icloud.com");
            step("Ввести пароль testPassword");
            step("Нажать кнопку \"Войти\"");
        });

        step("Проверить, что открылась страница https://example.com");
        step("Проверить профиль пользователя", () -> {
            step("Имя test");
            step("Логин testUser@icloud.com");
            step("Аватар");
        });
    }

    @Test
    @Owner("kanikeev")
    @Severity(SeverityLevel.CRITICAL)
    @Tags({@Tag("UI"), @Tag("Smoke")})
    @DisplayName("GitHub авторизация")
    public void authWithGitHub() {
        step("Открыть https://example.com");
        step("Нажать кнопку \"Авторизация\"");
        step("Нажать кнопку \"Авторизоваться с GitHub\"");
        step("Авторизоваться под тестовым пользоваетелем", () -> {
            step("Ввести логин testUserId");
            step("Ввести пароль testPassword");
            step("Нажать кнопку \"Войти\"");
        });

        step("Проверить, что открылась страница https://example.com");
        step("Проверить профиль пользователя", () -> {
            step("ID testUserId");
            step("Аватар");
        });
    }
}