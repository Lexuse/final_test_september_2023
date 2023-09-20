# final_test_september_2023
### Итоговая контрольная работа по блоку специализация
It is necessary to organize an accounting system for the nursery in which domestic and pack animals live.  
Необходимо организовать систему учета для питомника в котором живут домашние и вьючные животные.
*** 
1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
![task_1.JPG](Screenshot%2Ftask_1.JPG)
***
2. Создать директорию, переместить файл туда.  
![task_2.JPG](Screenshot%2Ftask_2.JPG)  
***
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.    
   sudo apt-get update  
   sudo apt-get install wget  
   wget https://dev.mysql.com/get/mysql-apt-config_0.8.17-1_all.deb  
   sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb  
![task_3.JPG](Screenshot%2Ftask_3.JPG)
***
4. Установить и удалить deb-пакет с помощью dpkg.  
   sudo dpkg -i mc_4.8.27-1_amd64.deb  
   sudo dpkg -r mc_4.8.27-1_amd64.deb  
   или полное удаление пакета с конфин файлами:  
   sudo dpkg -P mc_4.8.27-1_amd64.deb  
***
5. Выложить историю команд в терминале ubuntu  
![task_5.JPG](Screenshot%2Ftask_5.JPG)
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
Диаграмма в файлах проекта. [Diagram Class.drawio](Diagram%20Class.drawio)  
***
7. -12. 7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.  
Работа с базой данных в фале SQL_work_7-12 [SQL_work_7-12.sql](SQL_work_7-12.sql)  
*** 
13. 