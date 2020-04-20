/*                            Создать класс, который может выполнять «тесты».
        В качестве тестов выступают классы с наборами методов, снабженных аннотациями @Test. Класс, запускающий тесты,
        должен иметь статический метод start(Class testClass), которому в качестве аргумента передается объект типа Class.
        Из «класса-теста» вначале должен быть запущен метод с аннотацией @BeforeSuite, если он присутствует.
        Далее запускаются методы с аннотациями @Test, а по завершении всех тестов – метод с аннотацией @AfterSuite.
        К каждому тесту необходимо добавить приоритеты (int-числа от 1 до 10), в соответствии с которыми будет
        выбираться порядок их выполнения. Если приоритет одинаковый, то порядок не имеет значения.
        Методы с аннотациями @BeforeSuite и @AfterSuite должны присутствовать в единственном экземпляре.
        Если это не так – необходимо бросить RuntimeException при запуске «тестирования».
        P.S. Это практическое задание – проект, который пишется «с нуля».
                      Данная задача не связана напрямую с темой тестирования через JUnit */


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n>>>>>>>>>>>    Class - MyTest    <<<<<<<<<<");
        Class mt1 = MyTest.class;
        test(mt1);
        System.out.println("\n>>>>>>>>>>>    Class - DoubleSuite    <<<<<<<<<<");
        Class mt2 = DoubleSuite.class;
        test(mt2);
    }

    public static void test(Class testClass) throws Exception {
        Method[] methods = testClass.getDeclaredMethods();
        int beforeFlag = 0, afterFlag = 0;

        for (Method method: methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)){       // Количество BeforeSuite
                beforeFlag++;
            }
            if(method.isAnnotationPresent(AfterSuite.class)){        // Колисество AfterSuite
                afterFlag++;
            }
        }
        if (beforeFlag>1 || afterFlag>1){throw new RuntimeException("Exception by Suite");} // Больше 1 -> Exception


        for (Method method: methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)){
                method.invoke(null);
            }
        }

        for (int i = 1; i <= 10; i++) {
            for (Method method: methods) {
                if(method.isAnnotationPresent(Test.class)){
                    if(i == method.getAnnotation(Test.class).priority()) { // Выводим все с приоритетом - i
                        method.invoke(null);
                    }
                }
            }
        }

        for (Method method: methods) {
            if(method.isAnnotationPresent(AfterSuite.class)){
                method.invoke(null);
            }
        }
    }
}
