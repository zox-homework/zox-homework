#include <iostream>
#include <ctime>
int main()
{
    // Запрашиваем имя пользователя
    std::cout << "Enter your nickname: ";
    std::string name;
    std::cin >> name;
    // Получаем текущее время и дату
    std::time_t current_time = std::time(0);
    std::tm *local_time = std::localtime(&current_time);
    // Выводим приветствие и текущее время
    std::cout << "HEY, " << name << "!" << std::endl;
    std::cout << "Today is " << (local_time->tm_mday) << " " << (local_time->tm_mon + 1) << " "
              << (local_time->tm_year + 1900) << std::endl;
    return 0;
}