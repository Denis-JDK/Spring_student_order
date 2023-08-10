package my.homework.spring_next_step;

import lombok.*;
import my.homework.spring_next_step.domain_answerAfterCheck.Adult;
import my.homework.spring_next_step.domain_answerAfterCheck.Child;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//Класс данных заявилетей в заявки ФИО, номер серия паспорта, год рождения, регистрация, учеба и т.п.
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentOrder {

    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;



}
