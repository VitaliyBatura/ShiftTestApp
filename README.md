# ShiftTestApp
### Стэк технологий:
Java 8; Maven 4.0.0;
### Описание задачи:
Написать программу сортировки слиянием нескольких файлов.        
Входные файлы содержат данные одного из двух видов: целые числа или строки. Данные записаны в столбик (каждая строка файла – новый элемент). Строки могут содержать любые не пробельные символы, строки с пробелами считаются ошибочными. Также считается, что файлы предварительно отсортированы.         
Результатом работы программы должен являться новый файл с объединенным содержимым входных файлов, отсортированным по возрастанию или убыванию путем сортировки слиянием.
### Примеры запуска программы из командной строки:
java -jar out/ShiftTestApp.jar -i out.txt in1.txt in2.txt in3.txt (для целых чисел по возрастанию)       
java -jar out/ShiftTestApp.jar -a -s out.txt in1s.txt in2s.txt in3s.txt (для строк по возрастанию)         
java -jar out/ShiftTestApp.jar -d -i out.txt in1.txt in2.txt in3.txt (для целых чисел по убыванию)        
java -jar out/ShiftTestApp.jar -d -s out.txt in1s.txt in2s.txt in3s.txt (для строк по убыванию) 
