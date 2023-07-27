<h1 align="center">Задачи</h1>

## 22. Задача

Проектирайте интерфейс на име Colorable с void метод, наречен howToColor ().Класът GeometricObject трябва да имплементира интерфейса Colorable, но не и метода howToColor. GeometricObject съдържа и абстрактните методи getArea и getPerimeter  Проектирайте клас на име Square, който наследява GeometricObject. Имплементирайте метода howToColor и покажете съобщението “Оцветете и четирите страни”. Класът Square има private double поле, наречено side със своите getter и setter методи. Square има конструктор no-arg, за да създадете квадрат със страна 1, и друг конструктор, който създава квадрат с посочената страна.

Напишете тестова програма, която създава масив от пет GeometricObject. За всеки обект в масива, покажете неговата площ и извикайте метода му howToColor, ако е оцветен.

## 23. Упражнение

1. Направете проучване за интерфейса **Comparable** и класа **ArrayList**. Потърсете как имплементирането на интерфейса би повлияло употребата на ArrayList от клас, създаден от нас. Променете класа GeometricObject и имплементирайте интерфейса Comparable, който да сравнява лицата на обектите. Дефинирайте статичен метод max в класа GeometricObject за намиране на по-големия от два обекта от класа GeometricObject.

  Напишете  тестова програма, която 
  - Използва метода max, за да намери по-големия от два кръга, по-големия от два правоъгълника.
  - Създава ArrayList от пет правоъгълника, сортира ги и ги извежда в конзолата

2. Напишете метод, който сумира лицето на всички геометрични обекти в масив. Сигнатурата на метода е:

  **public static double sumArea(GeometricObject[] a)**

  Напишете тестова програма, която създава масив от четири обекта (два кръга и два правоъгълника) и изчислява общата им площ с помощта на метода sumArea.

3. Проучете интерфейса **Clonable** и концепцията за deep copy. Пренапишете класа Course, така че да имплементира интерфейса Clonable. Внимавайте да извършите дълбоко копиране - deep copy, на полето за ученици.

## 24. Упражнение

1. (The Course class) Препишете класа на Course от задача 16.2. Използвайте ArrayList за замяна на масивa за съхраняване на ученици. Начертайте UML диаграма за класa. Не трябва да променяте оригиналния договор на класа Course (т.е. дефиницията на конструкторите и методите не трябва да се променя, а private полетата могат да бъдат сменени.)

  Препоръчвам да използвате онлайн платформата https://app.creately.com/ за създаване на UML диаграма.

2. Разгледайте и тествайте следния код. Какво според вас прави instanceof? Какво според вас правят ((Circle)object).getArea()) и ((Rectangle)object).getArea())? Разгледайте досегашните си програми, къде бихте използвали instanceof  и кастване на един обект към друг?

```java
public class CastingDemo {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);
    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  public static void displayObject(Object object) {
    if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle) object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle) object).getDiameter());
    } else if (object instanceof Rectangle) {
      System.out.println("The rectangle area is " +
        ((Rectangle) object).getArea());
    }
  }
}
```
