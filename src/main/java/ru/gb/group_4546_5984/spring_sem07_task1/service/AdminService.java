package ru.gb.group_4546_5984.spring_sem07_task1.service;

import org.springframework.stereotype.Service;

/**
 * Сервис администратора
 */
@Service
public class AdminService {

    /**
     * Заголовок страницы администратора
     * @return текст заголовка
     */
    public String getText() {
        return "Страница Администратора";
    }

    /**
     * Заголовок страницы Private-data
     * @return текст заголовка
     */
    public String getPrivateText() {
        return "Private Cat`s Data";
    }

    /**
     * Изображение на странице Private-data
     * @return картинка
     */
    public String getCat() {
        return "/img/private-cat.svg";
    }
}
