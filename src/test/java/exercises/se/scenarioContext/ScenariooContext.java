package exercises.se.scenarioContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ScenariooContext {
    private static ScenariooContext instance;
    private Map<ScenarioScreenshot, Object> data;

    private ScenariooContext() {
        this.data = new HashMap<>();
    }

    public static ScenariooContext getScenariooContext() {
        if (Objects.isNull(instance)) {
            instance = new ScenariooContext();
        }
        return instance;
    }

    public Object getData(ScenarioScreenshot key) {
        return data.get(key);
    }

    public void saveData(ScenarioScreenshot key, Object object) {
        data.put(key, object);
    }
}
