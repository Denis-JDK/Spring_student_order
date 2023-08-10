package my.homework.spring_next_step.domain_answerAfterCheck;

import lombok.*;

//сущность по которая сможем понять ответ, состояние ответа из чего он состоит, после проверки студенческой заявки
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnswerCityRegister {
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
