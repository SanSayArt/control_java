// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.HashMap;

public class PhoneBook{
    public static void main(String[] args) {
        var phBook = new HashMap<String, String>(); // Создаём объект типа HashMap<String, String>
        //Заносим данные в объекте типа HashMap<String, String>
        phBook.put("+79064106293","Сергей Яковлев");
        phBook.put("+74996775624","Геннадий Шилов");
        phBook.put("+74996720056","Софья Карпова");
        phBook.put("+79064559359","Зинаида Борисова");
        phBook.put("+79052026204","Тимур Артамонов");
        phBook.put("+79062297167","Леонида Корнилова");
        phBook.put("+79052104173","Эльза Дегтярева");
        phBook.put("+79585380329","Роман Журавлев");
        phBook.put("+79033788272","Лариса Панфилова");
        phBook.put("+79050609891","Артём Виноградов");
        phBook.put("+79697657977","Геннадий Шилов");
        phBook.put("+79061689884","Софья Карпова");
        phBook.put("+79061665057","Зинаида Борисова");
        phBook.put("+79033755608","Тимур Артамонов");
        phBook.put("+79061663935","Сергей Яковлев");
        phBook.put("+79585779300","Геннадий Шилов");
        phBook.put("+79062604822","Лариса Панфилова");
        phBook.put("+79014992059","Геннадий Шилов");
        phBook.put("+79093869743","Леонида Корнилова");

    }

    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();    
        for (var item : dict.entrySet()) {  //Перебор вариантов
            if (result.containsKey(item.getValue())) {  //Проверяем, есть ли телефон с таким номером
                var key = item.getValue();              
                var value = result.get(item.getValue());    //Если есть телефон с таким номером
                result.replace(key, value + 1);             // Добавляем новый телефон в результат
            } else {
                result.put(item.getValue(), 1);  // Добавляем ФИ и телефон
            }
        }
        return result;  // Возвращаем результат
    }
}