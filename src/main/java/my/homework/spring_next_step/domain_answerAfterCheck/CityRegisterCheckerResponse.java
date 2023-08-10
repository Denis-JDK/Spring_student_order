package my.homework.spring_next_step.domain_answerAfterCheck;

public class CityRegisterCheckerResponse {
    private boolean existing; //существует ли Person в системе
    private Boolean temporal = true; //временная или постоянная регистрация, либо null если информация отсутствует

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}
