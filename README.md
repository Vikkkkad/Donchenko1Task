# Лабораторная работа №1. Создание activity и передача параметров между ними
## Выполнила: Донченко Вика, ИСП-211о
## Язык программирования: Java
### 1. Функции приложения
   Приложение состоит из двух activity и передает парамер с первого на второй по нажатию на кнопку.
### 2. Внешний вид приложения
   После запуска открывается MainActivity, на котором расположена кнопка "Перейти к Activity2", при нажатии на которую происходит переход на MainActivity2.
   
   ![Screenshot_1](https://github.com/user-attachments/assets/6b11e9a0-0b4f-4f34-ab8b-b426359471d0)

   При переходе передается параметр и на MainActiviti2 отображается текст "Переданный параметр: Донченко".
   
   ![Screenshot_2](https://github.com/user-attachments/assets/1b0b0209-48bf-4ce3-9593-cc313c9d38be)
   
### 3. Передача параметра
   Сначала создается новый объект Intent, который указывает, что мы хотим перейти от MainActivity к MainActivity2.
   
   `Intent intent = new Intent(MainActivity.this, MainActivity2.class);`
   
   Для того, что передать строку с ключом "surname" и со значением "Донченко", вызван метод putExtra.
   
   `intent.putExtra("surname", "Донченко");`
### 4. Принятие параметра
   Используется метод getIntent, чтобы получить Intent, который запустил текущую активность (MainActivity2). Затем с помощью метода getStringExtra извлекается значение, которое было передано под ключом "surname".
   
   `String surname = getIntent().getStringExtra("surname");`
   
   Используя строковый ресурс parameter_message, формируется строка сообщения.
   
   `String message = getString(R.string.parameter_message, surname);`
   
   После того как сообщение сформировано, оно устанавливается в TextView, чтобы отобразить его на экране.
   
   `textView.setText(message);`
   
### 5. Сборка проекта
- Скачать ZIP проета: для этого нужно нажать на "Code", а затем на "Download ZIP".
- Распаковать загруженный архив.
- Запустить Android Studio.
- Нажать на "Open" во вкладке "File".
- Выбрать файл "Donchenko1Task".
- Выбрать эмулятор или подключить реальное устройство.
- Нажать на "Run".
