package Task_9.Exceptions.Subtask_3;

public class User {
    private Integer age = 0;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer newAge) throws InvalidUserAgeException {
        if ((newAge < 0) || (newAge > 150)) {
            throw new InvalidUserAgeException("Указан недопустимый возраст пользователя: " + newAge);
        }

        this.age = newAge;
    }
}
