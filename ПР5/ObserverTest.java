public class ObserverTest {
    public static void main(String[] args) {
        ObservableStringBuilder sb = new ObservableStringBuilder();

        // Создаем наблюдателя, который просто выводит состояние в консоль
        OnChangeListener listener = stringBuilder -> {
            System.out.println("Изменение! Новое значение: " + stringBuilder.toString());
        };

        // Подписываем наблюдателя на изменения
        sb.addOnChangeListener(listener);

        sb.append("Первая строка. "); // Должно вызвать оповещение
        sb.append("Вторая строка.");   // Должно вызвать оповещение
        sb.delete(0, 15);            // Должно вызвать оповещение
    }
}