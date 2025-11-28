import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {

    private StringBuilder stringBuilder;
    private List<OnChangeListener> listeners = new ArrayList<>();

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    public void addOnChangeListener(OnChangeListener listener) {
        this.listeners.add(listener);
    }

    public void removeOnChangeListener(OnChangeListener listener) {
        this.listeners.remove(listener);
    }

    private void notifyListeners() {
        for (OnChangeListener listener : listeners) {
            listener.onChange(this);
        }
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyListeners();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyListeners();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}