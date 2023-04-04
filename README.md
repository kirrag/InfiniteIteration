# InfiniteIteration
Задача Бесконечная итерация
Описание

В этом задании попрактикуемся с шаблоном Iterator (Итератор).

Нужно написать класс, расширяющий Iterable<Integer>, по которому мы будем итерироваться. В процессе итерирования мы будем от него получать случайные числа в диапазоне значений. Диапазон задаётся двумя числами - минимальным и максимальным значениями. Передаются они через параметры конструктора. Таким образом, итератор по объектам нашего класса будет итерироваться по бесконечной последовательности из случайных чисел в заданом интервале:

public class Randoms implements Iterable<Integer> {
  protected Random random;

  public Randoms(int min, int max) {
    //...
  }

  //...
}

Пример использования вашего класса:

public static void main(String[] args) {
  for (int r : new Randoms(90, 100)) {
    System.out.println("Случайное число: " + r);
    if (r == 100) {
      System.out.println("Выпало число 100, давайте на этом закончим");
      break;
    }
  }
}

Реализация

    Создайте класс Randoms, скопируйте его заготовку из кода выше.
    Реализуйте требуемый интерфейсом Iterable метод, для чего вам может понадобиться создать вспомогательный класс для итератора (реализующего Iterator<Integer>) по вашему классу.
    Для генерации случайных чисел используйте встроенный класс Random.
    Создайте класс Main, продемонстрируйте работосбособность написанного вами класса, например как это было сделано выше.
    Протестируйте работу программы. Не забывайте про правила форматирования кода (для автоформата можете выделить код в идее и нажать Ctrl+Alt+L).

