# Как работает программа:

### * Student и Teacher — классы для студентов и преподавателей, которые содержат поля id и name.

### * StudyGroup — класс, представляющий учебную группу, содержащий преподавателя и список студентов.

### * StudyGroupService — сервис для создания учебной группы на основе переданного преподавателя и студентов.

### * TeacherService и StudentService — сервисы для получения преподавателей и студентов по их id.

### * StudyGroupController — контроллер, который управляет созданием учебной группы, объединяя информацию о преподавателе и студентах.

### * Main — главный класс, который реализует логику ввода и взаимодействия с пользователем.


# Пример использования:

### * Программа запрашивает ID преподавателя.
### * Пользователь вводит ID студентов через запятую.
### * Контроллер создает учебную группу, и результат выводится на экран.