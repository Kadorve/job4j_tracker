package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.addItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker(); //создаем объект tracker.
        Item item = new Item("new item"); //создаем объект item.
        tracker.add(item); //добавляем item в tracker. После этой операции возникает id.
        String[] answers = {String.valueOf(item.getId()), //Достаем item.id и создаем массив с ответами пользователя.
        "replaced item"};
        StartUI.replaceItem(new StubInput(answers), tracker); //Вызываем тестируемый метод replaceItem. Это действие изменит состояние объекта tracker.
        Item replaced = tracker.findById(item.getId()); //Поиск по item.id замененного item в объекте tracker.
        assertThat(replaced.getName(), is("replaced item")); // Сравниаем имя найденной заявки с ожидаемой.
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()),
        "removed item"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is(nullValue()));

    }
}