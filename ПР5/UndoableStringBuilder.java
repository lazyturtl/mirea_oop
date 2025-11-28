import java.util.Stack;

public class UndoableStringBuilder {

    // Внутренний StringBuilder для выполнения операций
    private StringBuilder stringBuilder;

    // Стек для хранения истории команд
    private Stack<Command> history = new Stack<>();

    // Интерфейс для всех команд
    private interface Command {
        void execute();
        void undo();
    }

    // Реализация команды для операции append
    private class AppendCommand implements Command {
        private String toAppend;

        public AppendCommand(String toAppend) {
            this.toAppend = toAppend;
        }

        @Override
        public void execute() {
            stringBuilder.append(toAppend);
        }

        @Override
        public void undo() {
            int start = stringBuilder.length() - toAppend.length();
            int end = stringBuilder.length();
            stringBuilder.delete(start, end);
        }
    }

    // Конструктор
    public UndoableStringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    // Метод append, который создает и выполняет команду
    public UndoableStringBuilder append(String str) {
        AppendCommand command = new AppendCommand(str);
        command.execute();
        history.push(command);
        return this;
    }

    // Метод отмены последней операции
    public void undo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}