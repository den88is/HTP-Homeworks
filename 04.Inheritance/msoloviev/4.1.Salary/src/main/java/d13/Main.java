package d13;
/*Тема 4. Наследование. Абстрактные классы
Задание 4.1. Расчет заработной платы
Необходимо разработать приложение, которое может подсчитывать заработную
платы в компании, занимающейся разработкой ПО. В компании есть есть:
менеджеры по продажам, разработчики, руководители команд (занимается
разработкой и управлением команды), директор (только один).
Расчет зарплат сотрудников происходит по следующему правилу:
• Все сотрудники имеет фиксированную ставку заработной платы, но она
различная в зависимости от профессии и должности.
• Менеджеры по продажам получает 3% от заказов, которые они находят.
Каждый запись о сотруднике должна содержать
• имя
• фамилию
• дату рождения
• дату принятия на работу
Программист содержит информацию о технологии, которой он использует.
Руководитель команды должен иметь список разработчиков в его команде.
Ваша программ должна рассчитывать зарплату за месяц, квартал и год для каждой
команды и всей компании в целом.
Требования:
• Все необходимые данные должны генерироваться случайным образом.
(Причем в разумных пределах. Например, зарплата не может быть
числом с больше миллиарда или отрицательной)
• Количество созданных сотрудников компании должно быть не меньше 12
• Количество команд не меньше двух*/

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static int countEmployee(int max, int min) {
        return new Random().nextInt(max - min) + min;
    }
    public static void main(String[] args) {
        int countEmploys = countEmployee(13, 12);
        int countDirector = 1;
        int countDeveloper = countEmployee(countEmploys - countDirector - 2, 1);
        int countTeamLead = countEmployee(countEmploys - countDirector - countDeveloper - 1, 1);
        int countManager = countEmploys - countDeveloper - countDeveloper - countTeamLead;
        if (countDeveloper < countTeamLead) {
            countDeveloper += countTeamLead;
            countTeamLead = countDeveloper - countTeamLead;
            countDeveloper = countDeveloper - countTeamLead;
        }
        Company company = new Company(countDirector, countDeveloper, countManager, countTeamLead);
        // System.out.println(company.developers);
        //System.out.print(countTeamLead+"\n"+company.teamLeads);
        String beginTime = "13.07.1998";
        String endTime = "13.07.1999";
        // System.out.println(company.rateDeveloper);
        // System.out.println(company.rateTeamLider);
        int i = 0;
        for (TeamLead teamLead : company.teamLeads) {
            System.out.println(company.salaryCalcTeam(beginTime, endTime, i));
            ++i;
        }
        i = 0;
        for (SalesManager manager : company.salesManagers) {
            System.out.println(company.salaryCalcManager(beginTime, endTime, i));
            ++i;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date beginDate = simpleDateFormat.parse(beginTime, new ParsePosition(0));
        Date endDate = simpleDateFormat.parse(endTime, new ParsePosition(0));
        double salaryDirector = company.rateDirector * (endDate.getTime() - beginDate.getTime()) / company.millSecInMonth;
        System.out.println(salaryDirector);
        System.out.println(company.salaryCalcCompany(beginTime, endTime));
    }
}
